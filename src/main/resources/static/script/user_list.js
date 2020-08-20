$(() => {
    $.ajax({
        type:"get",
        url:"/user/list",
        dataType:"json",
        success:response=>{
            let list = response["data"]
            console.log(list)
            for (let i = 0;i<list.length;i++) {
                let username = list[0]['username']
                let str = "<tr> <td>"+(i+1)+"</td>" +
                    "<td>"+list[i]['username']+"</td>"+
                    "<td>"+list[i]['nickname']+"</td>"+
                    "<td>"+list[i]['phone']+"</td>"+
                    "<td>"+list[i]['email']+"</td>"+
                    "<td>"+list[i]['role']+"</td>"+
                    "<td><button type='button' class='btn btn-primary' onclick='popups(&quot;"+username+"&quot;)'>操作</button></td>"+
                    "</tr>"
                $("#user-table").append(str)
            }
            }
    })
});

function popups() {
    $("#myModalLabel").text("新增");
    $('#myModal').modal();

}

function btnUserUpdate() {
    $("#myModalLabel").text("新增");
    $('#myModal').modal();
    var formObject = {};
    let username = $("#username").val()
    let nickname = $("#nickname").val()
    let phone = $("#phone").val()
    let email = $("#email").val()
    let role = $("#role").val()
    formObject['username'] = username
    formObject['nickname'] = nickname
    formObject['phone'] = phone
    formObject['email'] = email
    formObject['role'] = role
    $.ajax({
        type: "post",
        url: "/user/update",
        contentType:"application/json",
        dataType: "json",
        data: JSON.stringify(formObject),
        success:response=>{
            console.log(response)
            alert("更新成功")
            location.reload()
        },
        error:(response)=>{
            console.log(response)
        }
    })
}

