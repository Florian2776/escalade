<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="application escalade">
    <meta name="author" content="Florian Brun">
    <link rel="icon" href="../img/favicon.ico">

    <title>Accueil</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../style/carousel.css" rel="stylesheet">
  </head>
  <body>

    <nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand" href="accueil.jsp">Escalade</a>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="accueil.jsp">Accueil<span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="decouvrir.jsp">Découvrir l'escalade</a>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled" href="#">Mon compte</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="admin.jsp">Espace administrateur</a>
          </li>
        </ul>
        <form class="form-inline mt-2 mt-md-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>

    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="carousel-item active">
          <img class="first-slide" src="../img/index1.jpg" alt="First slide">
          <div class="container">
            <div class="carousel-caption d-none d-md-block text-center">
              <h1>Rechercher un site !</h1>
              <p>
                Trouvez le site de vos rêves en utilisant notre base de données !
              	Actuellement plus de @0 sites répertoriés.
              </p>
              <p><a class="btn btn-lg btn-primary" href="sites.jsp" role="button">rechercher un site</a></p>
            </div>
          </div>
        </div>
        <div class="carousel-item" >
          <img class="second-slide" src="../img/index2.jpg" alt="Second slide">
          <div class="container">
            <div class="carousel-caption d-none d-md-block text-left">
              <h1>L'importance de l'entraînement</h1>
              <p>Ou comment éviter de se blesser bêtement, par @pseudo.</p>
              <p><a class="btn btn-lg btn-primary" href="articles.jsp" role="button">voir l'article</a></p>
            </div>
          </div>
        </div>
        <div class="carousel-item">
         <img class="third-slide" src="../img/index3.jpg" alt="Third slide">
          <div class="container">
            <div class="carousel-caption d-none d-md-block text-left">
              <h1>Pas encore inscrit ?</h1>
              <p>
              	Inscrivez vous gratuitement pour profiter de tous les avantages de ce site !
              	Les membres peuvent :
              </p>
              <ul>
              	<li>rédiger des articles,</li>
              	<li>partager/emprunter des topos,</li>
              	<li>écrire des commentaires etc.</li>
              </ul>
              <p><a class="btn btn-lg btn-primary" href="inscription.jsp" role="button">S'inscrire</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="rounded-circle" src="../img/accueil1.jpg" alt="faucon pèlerin" width="140" height="140">
          <h2>Attention aux faucons pèlerins !</h2>
          <p>
          	Pensez à bien vérifier vos sites de grimpe, 
          	il est interdit de grimper sur certaines parois 
          	signalées sous peine de déranger les faucons pèlerins 
          	en période de nidification.
          </p>
          <p><a class="btn btn-secondary" href="http://www.ffme.fr/escalade/article/periode-de-nidification-du-faucon-pelerin.html" role="button">En savoir plus &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="rounded-circle" src="../img/accueil2.jpg" alt="le port du casque" width="140" height="140">
          <h2>Le port du casque !</h2>
          <p>
          	Juste un petit rappel qui ne fait pas de mal, le port du casque est IN.DIS.PEN.SABLE !
          </p>
          <p><a class="btn btn-secondary" href="http://www.ffme.fr/uploads/federation/documents/reglements/escalade/escalade-regles-securite.pdf" role="button">Règlement de la FFME &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="rounded-circle" src="../img/accueil3.jpg" alt="Generic placeholder image" width="140" height="140">
          <h2>Le calendrier 2018 de Simon Carter's est arrivé !</h2>
          <p>
          	Simon Carter's, notre talentueux photographe, vient de sortir son calendrier 2018, n'hésitez plus, 
          	des photographies à couper le souffle vous attendent ! 
          </p>
          <p><a class="btn btn-secondary" href="http://www.onsight.com.au/product/world-climbing-calendar-2018/" role="button">En savoir plus &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->


      <!-- START THE FEATURETTES -->

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="featurette-heading">First featurette heading. <span class="text-muted">It'll blow your mind.</span></h2>
          <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7 push-md-5">
          <h2 class="featurette-heading">Oh yeah, it's that good. <span class="text-muted">See for yourself.</span></h2>
          <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
        <div class="col-md-5 pull-md-7">
          <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">Checkmate.</span></h2>
          <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <!-- /END THE FEATURETTES -->


      <!-- FOOTER -->
      <footer>
        <p class="float-right"><a href="#">Haut de page</a></p>
        <p>&copy; 2018 OpenClassRooms &middot; <a href="http://www.florian-brun.fr">Florian Brun</a> &middot;</p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="../js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
