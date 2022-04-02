<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.e">
<title>Responsive Admin Dashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>
 <div class="container">
   <div class="navigation">
      <ul>
        <li>
            <a href="#">
            <span class="icon"></span>
            <span class="title"><h2>Transition Salon</h2></span>
            </a>
        </li>
        <li>
            <a href="#">
            <span class="icon"><i class="fa fa-home" aria-hidden="true"></i></span>
            <span class="title">Dashboard</span>
            </a>
        </li>
        <li>
            <a href="allserv">
            <span class="icon"><i class="fa fa-bars" aria-hidden="true"></i></span>
            <span class="title">Services</span>
            </a>
        </li>
        <li>
            <a href="allsty">
            <span class="icon"><i class="fa fa-user-circle" aria-hidden="true"></i></span>
            <span class="title">Stylist</span>
            </a>
        </li>
        <li>
            <a href="#">
            <span class="icon"><i class="fa fa-eye" aria-hidden="true"></i></span>
            <span class="title">View Appointments</span>
            </a>
        </li>
        <li>
            <a href="out">
            <span class="icon"><i class="fa fa-sign-out" aria-hidden="true"></i></span>
            <span class="title">Sign out</span>
            </a>
        </li>
        </ul>
    </div>
    <div class="main">
        <div class="topbar">
            <div class="toggle" onclick="togglemenu();"></div>
            <div class="search">
                <lable>
                    <input type="text" placeholder="search here">
                </lable>
            </div>
            <div class="user">
                <img src="user.jpg">
            </div>
        </div>
    </div>
  </div>
  <script>
      function togglemenu(){
          let toggle=document.querySelector('.toggle');
          let navigation=document.querySelector('.navigation');
          toggle.classList.toggle('active')
          navigation.classList.toggle('active')
      }
  </script>
</body>
</html>