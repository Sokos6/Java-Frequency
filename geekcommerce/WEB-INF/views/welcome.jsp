<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


<title>Welcome</title>
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/jquery.cycle2.min.js"></script>
<style type="text/css">
* {padding:0; margin:0;}
body {font-family: Sans-Serif;}
img {max-width: 100%;}
/* cycle-slideshow */
.cycle-slideshow {
	width: 100%;
	max-width: 960px;
	display: block;
	position: relative;
	margin:20px auto;
	overflow: hidden;
}
.cycle-prev, .cycle-next {
	font-size: 200%;
	color: #FFF;
	display: block;
	position: absolute;
	top: 50%;
	margin-top: -16px;
	z-index: 9999;
	cursor: pointer;
}
.cycle-prev {left: 10%;}
.cycle-next {right: 10%;}
.cycle-pager {
	width: 100%;
	position: absolute;
	top: 20px;
	text-align: center;
	z-index: 9999;
	cursor: pointer;
}
.cycle-pager span {
	text-indent: 100%;
	white-space: nowrap;
	width: 10px;
	height: 10px;
	display: inline-block;
	border: 1px solid #FFF;
	border-radius: 50%;
	margin: 0 10px;
}
.cycle-pager .cycle-pager-active { background: #FFF;}
</style>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/geekcommerce">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="geekcommerce/products">Products <span class="sr-only">(current)</span></a></li>
        <li><a href="geekcommerce/customers">Customers</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="products.jsp">Action</a></li>
            <li><a href="http://www.comicbooked.com">Another action</a></li>
            <li><a href="http://www.comicbooked.com">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="http://www.comicbooked.com">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="http://www.comicbooked.com">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
  <!-- Responsive Image Slider -->

<div class="cycle-slideshow">
	<span class="cycle-prev">&#9001;</span>
  <span class="cycle-next">&#9002;</span>
  <span class="cycle-pager"></span>
  <img src="src/main/resources/images/5473689341.jpg">
  <img src="resources/817971-geek-wallpaper-hd.jpg">
  <img src="resources/HM-shop-online-2.png">
</div>

<!-- End Responsive Image Slider -->
  <section>
    <div class="jumbotron">
      <div class="container">
        <h1> ${greeting} </h1>
        <p> ${tagline} </p>
      </div>
    </div>
  </section>

</body>
</html>