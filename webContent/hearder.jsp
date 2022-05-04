<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <div class="search ">
         <div class="welcome"><h3 style="color: blue;">Welcome to my Wepsite</h3> 
        </div>
        <div class="divformSearch">
         <form class="formSearch" action="search" method="get">
            <span id="spanFormSearch">Categories</span>
            <input name = "search" type="text" class="input_search" id="idSearch"  placeholder="What are you loking for">
        </form>
      </div>
    </div>

    <div class="menu">
      <div class="menu1">
      <a href="${pageContext.request.contextPath}/home" class="menuLink Home">Home</a>
      <a href="#" class="menuLink">Products</a>
      <a href="#" class="menuLink">About Us</a>
    </div>
      <div class="menu2">
        <a href="login.jsp" class="menuLink">Login</a>
      </div>
    </div>
      