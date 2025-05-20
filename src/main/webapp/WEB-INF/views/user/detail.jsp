<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/17/2023
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <c:forEach items="${product}" var="product">
        <div class="col-sm-3">

            <ul class="row">
                <iframe width="560" height="315" src="https://www.youtube.com/embed/${video.href}"
                        title="YouTube video player" frameborder="0"
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                        allowfullscreen></iframe>
                <h5 class="card-title">${video.title}</h5>
                <p class="col-5" style="font-size: 20px;" class="home-product-item__name">${video.description}</p>
                <p class="col-5" style="font-size: 20px;" class="home-product-item__name">VIEWS ${video.views}</p>
                <a class="col-5">
                    <button  href="#" class="fa-solid fa-eye">like</button>
                </a>
                <a class="col-5">
                    <button  href="#" class="btn btn-primary">share</button>
                </a>

            </ul>

        </div>
    </c:forEach>
</div>
