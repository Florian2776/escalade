
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../img/favicon.ico">

    <title>Espace administrateur</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../style/admin.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">

      <form class="form-signin">
        <h2 class="form-signin-heading">Espace administrateur :</h2>
        <label for="inputEmail" class="sr-only">Email</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="tintin@exemple.com" required autofocus>
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me">Se souvenir de moi
          </label>
        </div>
        <button class="btn btn-lg btn-danger btn-block" type="reset">Effacer</button>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Se connecter</button>
      	<a href="accueil.jsp">
      		<button class="btn btn-lg btn-link btn-block">Accueil</button>
      	</a>
      </form>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../js/ie10-viewport-bug-workaround.js"></script>
	<script>
	    var email = document.getElementById("inputEmail");
	
	    /* Personnalisation des messages d'erreurs */
	    /* Adresse email */
	    email.addEventListener("keyup", function (event) {
	      /* correspondance au pattern */
	      if(email.validity.typeMismatch) {
	        email.setCustomValidity("Adresse e-mail incorrecte.");
	      } else {
	        email.setCustomValidity("");
	      }
	      
	      /* champ obligatoire */
	      if(email.validity.valueMissing) {
		        email.setCustomValidity("Ce champ est obligatoire.");
	      } else {
	        email.setCustomValidity("");
	      }
	    });
	    
	    /* Mot de passe */
	    var mdp = document.getElementById("inputPassword");
		
	    mdp.addEventListener("keyup", function (event) {
	      if(mdp.validity.typeMismatch) {
	        mdp.setCustomValidity("Mot de passe incorrect.");
	      } else {
	        mdp.setCustomValidity("");
	      }
	      
	      /* champ obligatoire */
	      if(mdp.validity.valueMissing) {
		        mdp.setCustomValidity("Ce champ est obligatoire.");
	      } else {
	        mdp.setCustomValidity("");
	      }
	    });    
    </script>
  </body>
</html>
