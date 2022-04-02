<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>ServiceForm</title>
    <script
      src="https://kit.fontawesome.com/b6b9586b26.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="style.css" />
  </head>
  
  
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
          <li class="menu-item current-menu-item"><a href="ind">Home</a></li>
          <li class="menu-item"><a href="mulsal">Salons</a></li>
          <li class="menu-item"><a href="abt">About</a></li>
          <li class="menu-item"><a href="cont">Contact</a></li>
          
        </ul> <!-- .menu -->
      </div> <!-- .main-navigation -->

      <div class="mobile-navigation"></div>
    </div>
  </header>

  <body>  
    </div>
    <div id="stylistform">
      <form method="post" action="insertService">
        <span>Service form</span>
        <div id="field">
          <label><i class="fas fa-user"></i></label>
          <input type="text" placeholder="Service Name" name="name" />
        </div>

        <div id="field">
        <label><i class="fas fa"></i></label>
        <input type="number" placeholder="Cost" name="cost" />
      </div>

        <div id="field">
          <label><i class="fas fa-user"></i></label>
          <input type="number" placeholder="Service time" name="time" />
        </div>

        <div id="field">
          <input type="submit" value="Submit" />
        </div>
      </form>
      
    </div>

    <script src="js/min/stylist.js"></script>
  </body>
</html>
