<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <!-- Basic -->
    <jsp:include page="../form/head.jsp"/>

</head>

<body class="sub_page">

<div class="hero_area">
    <div class="bg-box">
        <img src="/template/images/backgroundDark.jpg" alt="">
    </div>
    <!-- header section strats -->
    <header class="header_section">
        <jsp:include page="../form/nav.jsp"/>
    </header>
    <!-- end header section -->
</div>

<!-- food section -->

<section class="food_section layout_padding">
    <div class="container">
        <div class="heading_container heading_center">
            <h2>
                Our Menu
            </h2>
        </div>
        <div class="filters-content">
            <div class="row">
                <c:forEach var="product" items="${products}">
                    <div class="col-md-3  ">
                        <div class="box ">
                            <div class="img-box">
                                <img src="/template/product/${product.galeries[0].thumbnail}" alt="">
                            </div>
                            <div class="detail-box">
                                <h5>
                                        ${product.name}
                                </h5>
                                <h5>
                                        ${product.price}
                                </h5>
                                <h6>
                                    <span>20%</span> Off
                                </h6>
                                <a class="btn-block">detail</a>
                                <a href="">
                                    Order Now
                                    <svg version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" x="0px" y="0px"
                                         viewBox="0 0 456.029 456.029"
                                         style="enable-background:new 0 0 456.029 456.029;"
                                         xml:space="preserve">
                    <g>
                        <g>
                            <path d="M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248
                     c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z"/>
                        </g>
                    </g>
                                        <g>
                                            <g>
                                                <path d="M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48
                     C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064
                     c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4
                     C457.728,97.71,450.56,86.958,439.296,84.91z"/>
                                            </g>
                                        </g>
                                        <g>
                                            <g>
                                                <path d="M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296
                     c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z"/>
                                            </g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                                        <g>
                                        </g>
                  </svg>
                                </a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
    <%--      <div class="btn-box">--%>
    <%--        <a href="">--%>
    <%--          View More--%>
    <%--        </a>--%>
    <%--      </div>--%>
    </div>
</section>

<!-- end food section -->

<!-- footer section -->
<footer class="footer_section">
    <jsp:include page="../form/footer.jsp"/>
</footer>
<!-- footer section -->

<!-- jQery -->
<script src="js/jquery-3.4.1.min.js"></script>
<!-- popper js -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
</script>
<!-- bootstrap js -->
<script src="js/bootstrap.js"></script>
<!-- owl slider -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
</script>
<!-- isotope js -->
<script src="https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js"></script>
<!-- nice select -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js"></script>
<!-- custom js -->
<script src="js/custom.js"></script>
<!-- Google Map -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap">
</script>
<!-- End Google Map -->

</body>

</html>