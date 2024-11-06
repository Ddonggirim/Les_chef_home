package com.example.LesChef.service;


import com.example.LesChef.dto.AddCustomerRequest;
import com.example.LesChef.entity.Customer;
import com.example.LesChef.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.Random;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

private final CustomerRepository customerRepository;
private final BCryptPasswordEncoder bCryptPasswordEncoder;



    //회원가입 시 해당 아이디가 없으면 저장
    public String save(AddCustomerRequest dto){
        if(customerRepository.findById(dto.getId()).orElse(null) != null){
            log.info("회원가입 실패");
            return "";
        }else{
            customerRepository.save(Customer.builder()
                    .id(dto.getId())
                    .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                    .name(dto.getName())
                    .nickname(dto.getNickname())
                    .tel(dto.getTel())
                    .customerImg("/image1/MypageIcon/defaultCustomerImg.png")
                    .build());
            log.info("회원가입 성공");
            return "save";
        }
    }
    @Transactional
    public void edit(AddCustomerRequest dto, MultipartFile file, Customer currentUser){
        String currentId = currentUser.getId();
        log.info("현재 유저ID:" + currentId);
        Customer customer = customerRepository.findById(currentId).orElse(null);
        if(customer != null) {
            try {
                //회원이 새로운 이미지를 넣었는지 확인
                if ("".equals(file.getOriginalFilename())) {
                    //기존의 이미지 사용으로 로그만 출력
                    log.info("기존 이미지 사용");
                } else {
                    //파일의 저장위처
                    String filePath = "C:/LesChef_note/LesChef/src/main/resources/static/uploads/" + file.getOriginalFilename();
                    log.info(filePath);
                    log.info("새로운 이미지로 변경");
                    File dest = new File(filePath);
                    // 이미지를 dest에 저장된 경로에 저장
                    file.transferTo(dest);
                    // 이미지 변경으로 customer의 값을 변경
                    customer.setCustomerImg("/uploads/" + file.getOriginalFilename());
                }

            } catch (IOException e) {
                log.info("레시피 오류발생");
            }
            // 전달받은 dto의 값을 customer에 저장 후 save
            customer.setPassword(bCryptPasswordEncoder.encode(dto.getPassword()));
            log.info("정보수정됨");
            customer.setName(dto.getName());
            customer.setNickname(dto.getNickname());
            customer.setTel(dto.getTel());
            log.info("현재 회원의 이미지는 : " + customer.getCustomerImg());
            customerRepository.save(customer);
        }

    }
    //회원 삭제
    // 전달받은 회원의 정보를 비교결과에 따라 삭제 후 참 거짓 반환
    public boolean delete(AddCustomerRequest dto, Customer currentUser){

        boolean nicknameCheck = dto.getNickname().equals(currentUser.getNickname());
        boolean name = dto.getName().equals(currentUser.getName());
        boolean tel = dto.getTel().equals(currentUser.getTel());
        boolean passwordCheck = bCryptPasswordEncoder.matches(dto.getPassword(), currentUser.getPassword());

        if(nicknameCheck && name && tel && passwordCheck){
            customerRepository.delete(currentUser);
            return true;
        }
        return false;
    }

    public String findMyId(String name, String tel){

        String myId = customerRepository.findId(name, tel);
        if(myId != null){
            return myId;
        }
        return null;

    }

    //
    public Customer findMyPwd(String name, String tel, String id){
        Customer customer = customerRepository.findNameTelId(name, tel, id);
        return customer;
    }

    // 임시비밀번호 생성
    public String createTempPwd(){
        String[] tempPwd = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };
        Random random = new Random();
        String pwd = "";
        int i;
        int index = 0;
        for(i = 0; i < 8; i++){
            index = random.nextInt(tempPwd.length);
            pwd += (tempPwd[index]);
        }
        return pwd;
    }

    //생성한 임시 비밀번호 저장
    @Transactional
    public void editTempPwd(String id, String tempPwd){
        Customer customer = customerRepository.findById(id).orElse(null);
        customer.setPassword(bCryptPasswordEncoder.encode(tempPwd));
        customerRepository.save(customer);
    }
}
