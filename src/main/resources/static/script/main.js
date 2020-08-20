$(() => {
    $("#usernameIpt").append(sessionStorage.getItem("username"));

    $("#user-list").on("click",()=>{
        loadUserList();
    });
    $("#user-add").on("click",()=>{
        loadUserAdd();
    });
});

let loadUserList=()=>{
    $.ajax({
        url:"/user",
        type:"get",
        success:res=>{
            $("#extra").html(res);
        }
    })
};

let loadUserAdd=()=>{
    $.ajax({
        url:"/user/add",
        type:"get",
        success:res=>{
            $("#extra").html(res);
        }
    })
};


