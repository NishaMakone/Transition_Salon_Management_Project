<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>multiple salons</title>

    <link rel="stylesheet" href="style.css" />
  </head>


  <body class="homepage header-collapse">

    <div id="site-content">
        
        <header class="site-header">
            <div class="container">
                <a id="branding" href="index.html">
                    <img src="images/logo.png" alt="Company name" class="logo">
                    <div class="logo-copy">
                        <h1 class="site-title">Transition Salon</h1>
                        <small class="site-description">Transition Salon Management System</small>
                    </div>
                </a> <!-- #branding -->

                
                <!-- Default snippet for navigation -->
                <div class="main-navigation">
                    <button type="button" class="menu-toggle"><i class="fa fa-bars"></i></button>
                    <ul class="menu">
                        <li class="dropdown current-menu-item"><a href="ind">Home</a></li>
                        <li class="dropdown"><a href="mulsal">Salons</a></li>
                        <li class="dropdown"><a href="abt">About</a></li>
                        <li class="dropdown"><a href="cont">Contact</a></li>
                        <li class="dropdown"><a href="javascript:void(0)" class="dropbtn" >Login</a>
                            <div class="dropdown-content">
                        <a href="abc">Customer</a>
                        <a href="xyz">Salon</a>  </div></li>
                    </ul> <!-- .menu -->
                </div> <!-- .main-navigation -->

                <div class="mobile-navigation"></div>
            </div>
        </header>
    </body>


  <body class="salonbody">
    <div class="grid">
      <div class="grid-item">
        <div class="card">
          <img class="card-img" src="./images/salon1.jpg" alt="salon1" />
          <div class="card-content">
            <h1 class="card-header">Salon 1</h1>
            <p class="card-text">
              Rome is known for its stunning <strong> architecture</strong>,
              with the Colleseum, Pantheon, and Trevi Fountain as the main
              attractions.
            </p>
            <button href="#" class="card-btn">Read more</button>
          </div>
        </div>
      </div>
      <div class="grid-item">
        <div class="card">
          <img
            class="card-img"
            src="./images/salon2.jpeg"
            alt="salon2"
          />
          <div class="card-content">
            <h1 class="card-header">Salon 2</h1>
            <p class="card-text">
              One of the world's natural wonders, the iconic Grand Canyon draws
              oohs and aahs from visitors perched at the edge of its
              <strong>towering cliffs</strong>.
            </p>
            <button href="#" class="card-btn">Read more</button>
          </div>
        </div>
      </div>
      <div class="grid-item">
        <div class="card">
          <img class="card-img" src="./images/salon3.jpeg" alt="salon3" />
          <div class="card-content">
            <h1 class="card-header">Salon 3</h1>
            <p class="card-text">
              The Maldives are known for their
              <strong>natural environment</strong> including the blue ocean,
              white beaches, and clean air, attracting tourists.
            </p>
            <button href="#" class="card-btn">Read more</button>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
