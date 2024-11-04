const add_textbox = () => {
  const box = document.getElementById("box");
  const newP = document.createElement('div');
  newP.setAttribute('id', 'ingredient');
  newP.innerHTML =
  `<input type='text'  name='ingredients[]' placeholder='재료 이름' required>
   <input type='text' name='quantities[]' placeholder='수량' required>
   <input type='button' value='-' onclick='remove(this)'>`;
  box.appendChild(newP);
}
const remove = (obj) => {
  document.getElementById('box').removeChild(obj.parentNode);
}




document.addEventListener('DOMContentLoaded', function() {
  const fileInput = document.getElementById('imageInput');
  let currentImgElement = null;

  // body에 클릭 이벤트 리스너 추가
  document.body.addEventListener('click', function(e) {
      if (e.target.classList.contains('clickable-img')) {
          currentImgElement = e.target;
          const inputId = e.target.getAttribute('data-input-id'); // 이미지와 연결된 파일 입력 ID 가져오기
          const fileInput = document.getElementById(inputId);
          if (fileInput) { // 파일 입력이 존재하는 경우에만 클릭
              fileInput.click();
          }
      }
  });

  // 파일 입력에 변경 이벤트 리스너 추가
//  fileInput.addEventListener('change', function(event) {
//      const file = event.target.files[0];
//      if (file && currentImgElement) {
//          const reader = new FileReader();
//          reader.onload = function(e) {
//              currentImgElement.src = e.target.result;
//          };
//          reader.readAsDataURL(file);
//      }
//  });
    document.body.addEventListener('change', function(event) {
        if (event.target.matches('input[type="file"]')) { // 파일 입력만 처리
            const file = event.target.files[0];
            if (file && currentImgElement) {
                const reader = new FileReader();
                reader.onload = function(e) {
                    currentImgElement.src = e.target.result; // 이미지 업데이트
                };
                reader.readAsDataURL(file);
            }
        }
    });
});

const add_textbox1 = () => {
  const currentStepImg = document.querySelectorAll('[id^="imageInput"]');
  const nextImgId = currentStepImg.length + 1;
  const newId = 'toggleImage' + nextImgId+1;
  const inputId = 'imageInput' + nextImgId;

  const box = document.getElementById("box1");
  const newP = document.createElement('div');
  newP.setAttribute('class', 'step');
  newP.innerHTML = `
      <img src='../image1/MypageIcon/bap.png' alt='Click to change image' id='${newId}' class='clickable-img' data-input-id='${inputId}'>
      <input type='file' id='${inputId}' name='stepFiles[]' style='display: none;' accept='image/*' required>
      <input type="hidden" name="firstImage[]"/>
      <textarea name = "stepWays[]" required></textarea>
      <input type='button' value='-' onclick='remove1(this)'>
  `;
  box.appendChild(newP);
};

const remove1 = (obj) => {
  document.getElementById('box1').removeChild(obj.parentNode);
};


function validateForm(){
    const recipename = document.getElementById("recipeName").value;

    if(!recipeName){
        alert("레시피 이름을 입력하세요");
        return false;
    }
}





//이부분 다시 보기

//document.querySelector('form').addEventListener('submit', function(event) {
//    event.preventDefault(); // 기본 폼 제출 방지
//
//    const formData = new FormData(this); // 현재 폼의 데이터를 FormData로 변환
//    const data = Object.fromEntries(formData.entries()); // FormData를 객체로 변환
//
//    fetch('/List/create', {
//        method: 'POST',
//        headers: {
//            'Content-Type': 'application/json',
//        },
//        body: JSON.stringify(data), // 객체를 JSON 문자열로 변환
//    })
//    .then(response => {
//        if (!response.ok) {
//            throw new Error('Network response was not ok');
//        }
//        return response.json(); // JSON 응답으로 변환
//    })
//    .then(data => {
//        console.log('Success:', data); // 성공적으로 등록된 데이터 처리
//    })
//    .catch(error => {
//        console.error('Error:', error); // 에러 처리
//    });
//});
