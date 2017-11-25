    <%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
    <script src="https://code.jquery.com/jquery.min.js"></script>
    <style>
        .back {
            background-image: url('');
            background-size: 100%;
        }
        .title_img{
            margin-top: 89.8px;
            margin-left:63.2px;
            margin-right: 62.8px;

        }
        .middle_input {
            width: 65%;
            height: 15.6%;
            font-family: AppleSDGothicNeoI;
            font-size: 35px;
            line-height: 1.64;
            text-align: center;
            color: #7c7c7c;
            margin-left: 17.3%;
            margin-top:13.8%;
            margin-right: 17.2%;
        }
        .bottom_img{
            width:100%;
            height:27%;
            margin: 0 auto;
            margin-top: 15%;
            margin-left: 17.6%;
            margin-right: 16%;
        }
        .center{
            width: 70%;
        }

        .a{
            margin: 0 auto;
            padding-bottom: 5%;
        }
    </style>
</head>
<body class="back">
<div class="title_img">
    <img src="logo.png" width="100%"/>
</div>
<div class="middle_input">
    감정약꾹은<br/>
    바쁜 일상에서 자신의 감정을<br/>
    돌보기 힘든 사람들을 대상으로,<br/>
    그들의 감정에 처방전을 제공하는<br/>
    라이트하고 재미있는 서비스입니다.
</div>
<div class="bottom_img">
    <div class="a">
        <img src="main_button-01.png" class="center" id="move"/>
    </div>
</div>
<script>
    $(function(){
        $('#move').click(function(){
            var url = "picture";
            location.href = url;
        });
    });
</script>
</body>
</html>

