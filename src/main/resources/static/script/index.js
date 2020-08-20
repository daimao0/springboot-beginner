$(() => {
    $("#tip-div").hide();

    $("#resetIpt").on("click", () => {
        $("#tip-div").hide();
    });

    $("#login-but").on("click", () => {
        let username = $("#usernameIpt").val();
        let password = $("#passwordIpt").val();
        login(username, password);
    });

    $(document).keydown((event)=>{
        if (event.keyCode === 13){
            $("#login-but").trigger("click");
        }
    })

});
let login = (username, password) => {
    $.ajax({
        type: "POST",
        url: "/login",
        data: {"username": username, "password": password},
        success: map => {
            if (map.message === "登录成功") {
                sessionStorage.setItem("username", username);
                window.location.href = "/main";
            } else {
                $("#tip-div").show();
            }
        },
        error: () => {
            window.location.href = "/error";
        }
    })
};
