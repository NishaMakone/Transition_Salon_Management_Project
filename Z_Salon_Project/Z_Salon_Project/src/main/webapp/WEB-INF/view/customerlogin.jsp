<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>login</title>
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
    <div id="sign_in">
      <form action="logcust" method="post">
        <span>Login</span>
        <div id="field">
          <label><i class="fas fa-user"></i></label>
          <input type="text" placeholder="Email"  name="email"/>
        </div>

        <div id="field">
          <label><i class="fas fa-lock"></i></label>
          <input type="password" placeholder="Password"  name="password" />
        </div>

        <div id="field">
          <input type="submit" value="Log in" />
        </div>
      </form>

      <p>
         Not a member?
        <button onclick="signUp()"><a>Sign up now</a></button>
        <a href="forgotpass">forgot password</a>
      </p>
    </div>
    
    <div id="sign_up">
      <form method="post" action="insertCustomer">
        <span>Sign Up</span>
        <div id="field">
          <label><i class="fas fa-user"></i></label>
          <input type="text" placeholder="Customer Name" name="name" required />
        </div>

        <div id="field">
        <label><i class="fas fa-user"></i></label>
        <input type="number" placeholder="Mobile" name="mobile" required />
      </div>

        <div id="field">
          <label><i class="fas fa-envelope-open"></i></label>
          <input type="email" placeholder="Email Address" name="email" required />
        </div>

        <div id="field">  
        <label><i class="fas fa-user"></i></label>
        <input type="text" placeholder="Gender" name="gender" required />
      </div>

      <div id="field">
      <label><i class="fas fa-user"></i></label>
      <input type="text" placeholder="City" name="city" required />
    </div>

     <div id="field">
          <label><i class="fas fa-user"></i></label>
          <input type="text" placeholder="Username" name="username" required />
        </div>
        
        <div id="field">
          <label><i class="fas fa-lock"></i></label>
          <input type="password" placeholder="Password" name="password" required />
        </div>

        <div id="field">
          <input type="submit" value="Register" />
        </div>
      </form>

      <p>
        Already a member?
        <button onclick="signIn()"><a>Sign in now</a></button>
        <i class="fas fa-arrow-right"></i>
      </p>
    </div>

    <script src="js/min/signin.js"></script>
  </body>
</html>
