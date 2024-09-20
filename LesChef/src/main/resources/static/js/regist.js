const add_textbox = () => {
  const box = document.getElementById("box");
  const newP = document.createElement('p');
  newP.innerHTML = `<input type='text'> <input type='text'> <input type='button' value='-' onclick='remove(this)'>`;
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
          fileInput.click();
      }
  });

  // 파일 입력에 변경 이벤트 리스너 추가
  fileInput.addEventListener('change', function(event) {
      const file = event.target.files[0];
      if (file && currentImgElement) {
          const reader = new FileReader();
          reader.onload = function(e) {
              currentImgElement.src = e.target.result;
          };
          reader.readAsDataURL(file);
      }
  });
});

let counter = 1;

const add_textbox1 = () => {
  const newId = 'toggleImage' + counter++;
  const box = document.getElementById("box1");
  const newP = document.createElement('p');
  newP.innerHTML = `
      <img src='/img/profile.png' alt='Click to change image' id='${newId}' class='clickable-img'>
      <textarea></textarea>
      <input type='button' value='-' onclick='remove1(this)'>
  `;
  box.appendChild(newP);
};

const remove1 = (obj) => {
  document.getElementById('box1').removeChild(obj.parentNode);
};




function submitData() {
    const title = document.querySelector('input[name="title"]').value;
    const portion = document.querySelector('select[name="portion"]').value;
    const runtime = document.querySelector('select[name="runtime"]').value;
    const cooklevel = document.querySelector('select[name="cooklevel"]').value;
    const ingredients = Array.from(document.querySelectorAll('input[name="ingredients[]"]')).map(input => input.value);

    // 각 데이터를 별도로 저장하는 요청을 보냅니다.
    fetch('/saveTitle', {
        method: 'POST',
        body: JSON.stringify({ title }),
        headers: { 'Content-Type': 'application/json' }
    });

    fetch('/savePortion', {
        method: 'POST',
        body: JSON.stringify({ portion }),
        headers: { 'Content-Type': 'application/json' }
    });

    fetch('/saveRuntile', {
        method: 'POST',
        body: JSON.stringify({ runtime }),
        headers: { 'Content-Type': 'application/json' }
    });

    fetch('/saveCooklevel', {
        method: 'POST',
        body: JSON.stringify({ cooklevel }),
        headers: { 'Content-Type': 'application/json' }
    });

    // 재료도 저장
    ingredients.forEach(ingredient => {
        fetch('/saveIngredient', {
            method: 'POST',
            body: JSON.stringify({ ingredient }),
            headers: { 'Content-Type': 'application/json' }
        });
    });
}
