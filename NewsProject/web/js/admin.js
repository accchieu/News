function deletePost(id) {
    let check = confirm(`Bạn có muốn xóa post có id: ${id}?`);
    if (check == true) {
        window.location = `admin-post-delete?post_id=${id}`;
    }
}