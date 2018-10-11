$(function(){
    searchpage();
})
function searchpage(){

    $('#showUserTable').datagrid({
        url:'../user/queryUser',
        rownumbers:true,
        fitColumns:true,
        selectOnCheck:false,
        checkOnSelect:false,
        singleSelect:true,
        pagination:true,
        pageSize:5,
        pageList:[5,10,15],
        pageNumber:1,
        toolbar:'#toolbar2',
        fit:true,
        columns:[[
            {field:'che',checkbox:true},
            {field:'id',title:'单号'},
            {field:'name',title:'姓名'},
            {field:'sex',title:'性别'}
        ]]

    });
}
function toAddUser(){
    $('#addUserInfo').dialog({
        title: '新增用户信息',
        href:"../user/toAddUser",
        width: 300,
        height: 300,
        modal: false,
        buttons:[{
            text:'保存',
            handler:function(){
                $.ajax({
                    url:'../user/addUser',
                    type:'post',
                    data:$('#addUserForm').serialize(),
                    success:function(){
                        $('#addUserInfo').dialog("close");
                        searchpage();
                        $.messager.show({
                            title:'我的消息',
                            msg:'新增用户信息成功',
                            timeout:2000,
                            showType:'slide'
                        });
                    }
                })
            }
        },{
            text:'关闭',
            handler:function(){
                $('#addUserInfo').dialog("close");
            }
        }]
    });
}
function toEdit(){
    var userInfo = $('#showUserTable').datagrid('getSelected');
    var userId = userInfo.id;
    $('#editUserInfo').dialog({
        title: '修改用户信息',
        href:"../user/toEditUser?userId="+userId,
        width: 300,
        height: 300,
        modal: false,
        buttons:[{
            text:'保存',
            handler:function(){
                $.ajax({
                    url:'../user/editUser',
                    type:'post',
                    data:$('#editUserForm').serialize(),
                    success:function(){
                        $('#editUserInfo').dialog("close");
                        searchpage();
                        $.messager.show({
                            title:'我的消息',
                            msg:'修改用户信息成功',
                            timeout:2000,
                            showType:'slide'
                        });
                    }
                })
            }
        },{
            text:'关闭',
            handler:function(){
                $('#editUserInfo').dialog("close");
            }
        }]
    });
}
function deleteUser(){
    var userInfo = $('#showUserTable').datagrid('getSelected');
    var userId = userInfo.id;
    $.ajax({
        url:'../user/deleteUser',
        type:'post',
        data:{userId:userId},
        success:function(){
            searchpage();
            $.messager.show({
                title:'我的消息',
                msg:'删除用户信息成功',
                timeout:2000,
                showType:'slide'
            });
        }
    })
}