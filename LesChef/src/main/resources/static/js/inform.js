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
