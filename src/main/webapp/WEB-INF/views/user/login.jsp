<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/28/2023
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <jsp:include page="../form/head.jsp"/>
</head>
<body>

<section class="vh-100" >
    <div class="container-fluid h-custom">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-md-9 col-lg-6 col-xl-5">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                     class="img-fluid" alt="Sample image">
            </div>
            <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                <form action="<c:url value="/login"/>" method="post">

                    <h1>Login Dior Shop</h1>
                    <div class="form-outline mb-4">
                        <input id="username" class="form-control form-control-lg" name="username"/>
                        <label class="form-label" >User Name</label>
                    </div>

                    <!-- Password input -->
                    <div class="form-outline mb-3">
                        <input id="password" class="form-control form-control-lg"  type="text" name="password"/>
                        <label class="form-label" >Password</label>
                    </div>
                    <div class="d-flex justify-content-between align-items-center">
                        <!-- Checkbox -->
                        <div class="form-check mb-0">
                            <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3"/>
                            <label class="form-check-label" for="form2Example3">
                                Remember me
                            </label>
                        </div>
                        <a href="#!" class="text-body">Forgot password?</a>
                    </div>

                    <div class="text-center text-lg-start mt-4 pt-2">
                        <button type="submit" class="btn btn-primary btn-lg"
                                style="padding-left: 2.5rem; padding-right: 2.5rem;">Login
                        </button>
                        <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="register"
                                                                                          class="link-danger">Register</a>
                        </p>
                    </div>

                </form>

            </div>
        </div>
    </div>
    <div>

    </div>
</section>

<%--<footer>--%>
<%--    <jsp:include page="../form/footer.jsp"/>--%>
<%--</footer>--%>
</body>
</html>
