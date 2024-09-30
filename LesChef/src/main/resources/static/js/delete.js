function deletePost(recipeId) {
    if (confirm('정말 삭제하시겠습니까?')) { // 확인 대화상자
        fetch('/recipe/delete/' + recipeId, {
            method: 'DELETE' // DELETE 메소드 사용
        })
        .then(response => {
            if (response.ok) {
                alert('삭제되었습니다.');
                location.reload(); // 페이지 새로 고침
            } else {
                alert('삭제 실패했습니다.');
            }
        })
        .catch(error => console.error('Error:', error));
    }
}