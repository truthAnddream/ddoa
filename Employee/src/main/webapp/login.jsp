<%--
  Created by IntelliJ IDEA.
  User: zty
  Date: 2020/11/13
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="jquery-2.1.1.js"></script>
    <style>
        #table1{
            align-self: center;
            margin-top: 300px;
        }
        #body{
            background-image: url("image/2.jpg");
            background-size: 100%;
            /*background-size: 1300px,950px;*/
        }
    </style>
</head>
<body id="body">
<script type="text/javascript">
    $(document).ready(function(){
        $("p").hide();
    });
</script>
<p align="center" >
    <button id="close">关闭摄像头</button>
    <button id="CatchCode">开始识别</button>
</p>
    <table align="center" id="table1" border="1" width="22%" style="height: 22%" bgcolor="#9400d1" >
        <tr>
            <td align="center">嘀嗒办公管理系统</td>
        </tr>
        <tr>
            <td align="center"> 用户名<input type="text" name="euser" id="euser"></td>
        </tr>
        <tr>
            <td align="center">密码 <input type="password" name="epass" id="epass"></td>
        </tr>
        <tr>
            <td align="center">验证码 <input type="text" style="width:120px;height:25px" name="email" id="email" onblur="Validate()"/><button onclick="sendEmail()" style="width: 50px;height: 20px;">发送</button></td>
        </tr>
        <tr>
            <td colspan="2"  align="center"><input type="button" value="登录" onclick="getUserPass()">&nbsp;<button id="open">人脸识别</button>
            </td>
        </tr>
    </table>
<div align="center" hide style="float: left;">
    <video id="video" width="300px" height="300px" autoplay></video>
    <canvas hidden="hidden" id="canvas" width="626" height="800"></canvas>
</div>
</body>
<script type="text/javascript">
    var email=0;
    var video;//视频流对象
    var context;//绘制对象
    var canvas;//画布对象
    $(function() {
        var flag = false;
        //开启摄像头
        $("#open").click(function() {
            //判断摄像头是否打开
            if (!flag) {
                //调用摄像头初始化
                open();
                flag = true;
                $("p").toggle();
            }
        });
        //关闭摄像头
        $("#close").click(function() {
            //判断摄像头是否打开
            if (flag) {
                video.srcObject.getTracks()[0].stop();
                flag = false;
            }
        });
        //拍照
        $("#CatchCode").click(function() {
            if (flag) {
                context.drawImage(video, 0, 0, 330, 250);
                CatchCode();
            } else
                alert("请先开启摄像头!");
        });
    });
    //将当前图像传输到后台
    function CatchCode() {
        //获取图像
        var img = getBase64();
        //Ajax将Base64字符串传输到后台处理
        $.ajax({
            type : "POST",
            url : "face",
            data : {
                img : img
            },
            dataType : "JSON",
            success : function(data) {
                //返回的结果
                //取出对比结果的返回分数，如果分数90以上就判断识别成功了
                if(parseInt(data.result.user_list[0].score) > 90) {
                    //关闭摄像头
                    video.srcObject.getTracks()[0].stop();
                    //提醒用户识别成功
                    //验证成功跳转页面
                    window.location.href="http://localhost:8081/#/dashboard?eid="+parseInt(data.result.user_list[0].user_id);
                }else {
                    alert("登陆失败,请重新识别")
                }
            },
            error : function(q, w, e) {
                alert(q + w + e);
            }
        });
    };
    //开启摄像头
    function open() {
        //获取摄像头对象
        canvas = document.getElementById("canvas");
        context = canvas.getContext("2d");
        //获取视频流
        video = document.getElementById("video");
        var videoObj = {
            "video" : true
        }, errBack = function(error) {
            console.log("Video capture error: ", error.code);
        };
        context.drawImage(video, 0, 0, 330, 250);
        //初始化摄像头参数
        if (navigator.getUserMedia || navigator.webkitGetUserMedia
            || navigator.mozGetUserMedia) {
            navigator.getUserMedia = navigator.getUserMedia
                || navigator.webkitGetUserMedia
                || navigator.mozGetUserMedia;
            navigator.getUserMedia(videoObj, function(stream) {
                video.srcObject = stream;
                video.play();
            }, errBack);
        }
    }
    //将摄像头拍取的图片转换为Base64格式字符串
    function getBase64() {
        //获取当前图像并转换为Base64的字符串
        var imgSrc = canvas.toDataURL("image/png");
        //截取字符串
        return imgSrc.substring(22);
    };

    function getUserPass() {
        var username = $('#euser').val();
        var code=$('#email').val();
        var password = $('#epass').val();
        if(code==null){
                alert("请输入验证码")
                window.location.href = "http://localhost:8080/#/login"
            }else {
            $.get("http://localhost:8888/login",{
                euser: username,
                epass: password
            },function(data) {
                console.log(data)
                window.location.href = "http://localhost:8080/#/dashboard?username=" + data.euser

         });
        }
    }

    function sendEmail() {
        $.get("http://localhost:8888/sendMail",{
        },function(data){
            email=data;
            alert("成功发送")
        });
    }
    function Validate() {
        var Pemail = $('#email').val();
        if(Pemail!=email){
            alert("验证码错误")
        }
    }

</script>
</html>
