<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="/">Finder Cinema</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="/">Home</a>
                    </li>
                    <li>
                        <a href="/showing/list">Now Showing</a>
                    </li>
                    <li>
                        <a href="/reserve/list">Reservation</a>
                    </li>
                    <li>
                        <a href="/review/listPage">Reviews</a>
                    </li>
                    <li>
                        <a>|</a>
                    </li>
<%
					// 세션이 존재하지 않거나 로그인된 사용자가 없다면 메뉴바가 로그인으로 표시
					if(session == null || session.getAttribute("login") == null){
%>
					<li><a href="/user/login">Login</a></li>
<%	
					} else{
%>
					<li><a href="#" onclick="logoutConfirm()">Logout</a></li>
<%
					}
%>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    
    <%-- 로그아웃 확인 자바스크립트 --%>
	<script type="text/javascript">
		function logoutConfirm(){
			if(confirm("로그아웃하시겠습니까 ?")){
				location.href = "/user/logout";
				
				return true;
			} else {
				return false;
			}
		} // logoutConfirm()
	</script>