// 평점: 별 선택시 갯수 채우는 함수

const stars = document.querySelectorAll('.countingstar');

stars.forEach(star => {
  star.addEventListener('click', function(){
    const value = parseInt(star.getAttribute('star'));

    // 별 초기화
    stars.forEach(function(s, index) {
      s.setAttribute('src',"../image1/ListIcon/사용자빈별.png");
      if (index < value) {
        s.setAttribute("src","../image1/ListIcon/사용자별.png");
      }
    });
  });
});


function wishListClick(){
    const images = ['../image1/ListIcon/하트1000.png', '../image1/ListIcon/하트빈100.png']
    const recipeNameElement = document.getElementById('title');
    const recipeName = recipeNameElement.textContent;
    const nowImgElement = document.getElementById('asideicon2');
    const nowImg = nowImgElement.getAttribute('src');
    const path = window.location.pathname;
    const parts = path.split('/');
    const recipeId = parts[parts.length - 1];
    var url = nowImg != '../image1/ListIcon/하트빈100.png' ? 'http://localhost:8080/wishDelete' : 'http://localhost:8080/wishSave'
    console.log("레시피 이름: " + recipeName);
    console.log("레시피 아이디: " + recipeId);
    console.log("찜이미지: " + nowImg);
    fetch(url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({
            wishListId: null, // 또는 생성된 ID를 여기에 넣을 수 있습니다.
            recipe: {
                recipeId: Number(recipeId),
            },
            customer: {
                id: null, // 현재 사용자 ID를 여기에 넣습니다.
            },
        }),
    })
    .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok ' + response.statusText);
            }
            return response.json(); // 응답이 JSON 형태일 경우
    })
    .then(data => {
        console.log('Success:', data);
        // 이미지 src를 업데이트
        if (nowImg === '../image1/ListIcon/하트빈100.png') {
            nowImgElement.setAttribute('src', '../image1/ListIcon/하트1000.png'); // 찜 목록 추가
        } else {
            nowImgElement.setAttribute('src', '../image1/ListIcon/하트빈100.png'); // 찜 목록 삭제
        }
    })
    .catch(error => console.error('Error:', error));
}









// 댓글 작성 버튼 클릭 시 조회에 뿌리기

//const send = document.querySelector('#resist');
//const coment = document.querySelector('#areasize');
//const container = document.querySelector('#comentcontainer');
//
//const firsttext = document.querySelector('.comentbox:nth-of-type(1)');
//
//  send.addEventListener('click',()=>{
//    const cloneBox = firsttext.cloneNode(true);
//    const cloneStars = cloneBox.querySelectorAll('.comentstar');
//
//    let count = 0;
//
//    cloneBox.querySelector('.comenttext').textContent = coment.value;
//
//    stars.forEach(function(star){
//      if(star.getAttribute('src') == '../img/레시피 아이콘/사용자별.png'){
//        count += 1;
//      }
//    });
//
//    cloneStars.forEach(function(cloneStar, index){
//      if(index < count){
//        cloneStar.setAttribute('src', "../img/레시피 아이콘/사용자별.png");
//      }else{
//        cloneStar.setAttribute("src", "../img/레시피 아이콘/사용자빈별.png");
//      }
//    })
//
//
//    container.append(cloneBox);
//
//    coment.value = "";
//  })
