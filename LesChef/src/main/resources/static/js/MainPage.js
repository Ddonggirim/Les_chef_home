let flag = false;


/* 페이지 스크롤 관리 */
function pageMovement(e){
  console.log(e.deltaY);
  if(flag){
    return;
  }

  flag = true;

  if(e.deltaY >= 0){
    window.scrollBy(0, window.innerHeight);
  }
  else if(e.deltaY < 0){
    window.scrollBy(0, -window.innerHeight);
  }

  setTimeout(() => {
    flag = false;
  }, 650);
}


//테스트


const loginButton = document.getElementById('loginButton');
const myPageButton = document.getElementById('myPageButton');
const loginModal = document.querySelector('.loginModal');
const loginBox = document.querySelector('.Login-box');
const joinToLogin = document.querySelector('#signup-box p span');
const goToJoinButton = document.querySelector('.go-to-join');
const goToFindButton = document.querySelector('#FindIdPw');
const loginInputForm = document.querySelector('.login-form-container');
const findInputForm = document.querySelector('.find-form-container');
const findIdForm = document.querySelector('.id-form-container');
const findPwForm = document.querySelector('.pw-form-container');
const findIdButton = document.querySelector('.id-button');
const findPwButton = document.querySelector('.pw-button');
const findToLogin = document.querySelector('.find-to-login span');
const findToLoginText = document.querySelector('.find-to-login');

//테스트

const leftLine = document.getElementById('left_box');
const underLine = document.getElementById('under_box');
const logo = document.querySelector('.Logo');
const menu = document.getElementById('left-sidebar');
const category = document.getElementById('menu');
const blockMenu = document.getElementById('select-menu');
const phrase1 = document.querySelectorAll('.main_phrase1')
const phrase2 = document.querySelectorAll('.main_phrase2')
let menuFlag = true;

window.onload = function(){
  window.scroll(0, 0);
}
/* 로고 클릭시 새로고침 */
logo.addEventListener('click', () =>{
  location.reload(true);
})

/* 메뉴 클릭 시 작동이벤트*/
category.addEventListener('click', () => {
  if(menuFlag){
    window.removeEventListener('wheel', pageMovement);
    blockMenu.style.transition = "all 1s";

    blockMenu.style.opacity = 1;
    leftLine.style.opacity = 0;
    underLine.style.opacity = 0;
    changeOpacity(phrase1, 0);
    changeOpacity(phrase2, 0);
    loginButton.style.opacity = "0"; //
    myPageButton.style.opacity = "0"; //
    loginButton.style.pointerEvents = "none";
    myPageButton.style.pointerEvents = "none";
    // removeItem();
    menuFlag = false;
  }
  else{
    window.addEventListener('wheel', pageMovement);
    // location.reload(true);
    blockMenu.style.transition = "none";
    blockMenu.style.opacity = 0;
    leftLine.style.opacity = 1;
    underLine.style.opacity = 1;
    loginButton.style.opacity = "1"; //
    myPageButton.style.opacity = "1"; //
    loginButton.style.pointerEvents = "all";
    myPageButton.style.pointerEvents = "all";
    changeOpacity(phrase1, 1);
    changeOpacity(phrase2, 1);
    menuFlag = true;
  }
});

/* 메뉴버튼 제거함수 */
// function removeItem() {
//   const items = menu.getElementsByTagName('li');
//   items[1].remove();
//   items[1].remove();
// }
function changeOpacity(elements, value){
  elements.forEach(element =>{
    element.style.opacity = value;
  })
}

function loginModalActive() {
  loginInputForm.style.display = "block";
  findInputForm.style.display = "none";
  findToLoginText.style.display = "none";
  if(loginModal.classList.contains('active')){
    loginBox.classList.remove('active');
    loginModal.classList.remove('active');
    window.addEventListener('wheel', pageMovement);
  }else{
    loginBox.querySelector("input").value = "";
    loginModal.classList.add('active');
    loginBox.classList.add('active');
    window.removeEventListener('wheel', pageMovement);
  }
}

loginBox.addEventListener('click', function(event) {
  event.stopPropagation();
});


window.addEventListener('wheel', pageMovement);
// window.addEventListener('scroll', detectBottom);

//로그인 모달
loginButton.addEventListener('click', loginModalActive);

loginModal.addEventListener('click', loginModalActive);

joinToLogin.addEventListener('click', loginModalActive);


goToJoinButton.addEventListener('click', () => {
  loginModalActive();

  window.scrollTo(0, 4 * window.innerHeight);
});


goToFindButton.addEventListener('click', () => {
  loginInputForm.style.display = "none";
  findInputForm.style.display = "block";
  findIdForm.style.display = "block";
  findPwForm.style.display = "none";
  findIdButton.style.backgroundColor = "#79AE84";
  findPwButton.style.backgroundColor = "#28442d";
  findToLoginText.style.display = "block";
});

findIdButton.addEventListener('click',() => {
  findIdButton.style.backgroundColor = "#79AE84";
  findPwButton.style.backgroundColor = "#28442d";
  findIdForm.style.display = "block";
  findPwForm.style.display = "none";
});

findPwButton.addEventListener('click', () => {
  findIdButton.style.backgroundColor = "#28442d";
  findPwButton.style.backgroundColor = "#79AE84";
  findIdForm.style.display = "none";
  findPwForm.style.display = "block";
});

findToLogin.addEventListener('click', () => {
  loginInputForm.style.display = "block";
  findInputForm.style.display = "none";
  findToLoginText.style.display = "none";
});