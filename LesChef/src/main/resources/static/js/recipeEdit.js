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
