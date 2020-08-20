
function insertUserFrom() {
    var formObject = {};
    var formArray =$("#insert-user-from").serializeArray();
    console.log(formArray)
    $.each(formArray,function(i,item){
        formObject[item.name] = item.value;
    });
    let role = $("#role-select").val();
    formObject['role'] = role
    console.log(formObject)
    $.ajax({
        type:"post",
        url:"/user/add",
        dataType: "json",
        contentType:"application/json",
        data: JSON.stringify(formObject),
        success:response=>{
            console.log(response)
            alert("添加成功")
            location.reload()
        },
        error:(response)=>{
            console.log(response)
            alert("添加失败!")
        }
    })
}