<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>

  <head>
    <meta charset="utf-8">
    <link href="css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      [class*="col"] { margin-bottom: 20px; }
      img { width: 100%; }
    </style>
  </head>

  <body>
    <div class="container">
        <header class="page-header">
            <nav class="navbar navbar-inverse">
              <div class="container-fluid">
                <div class="navbar-header">
                  <a class="navbar-brand" href="">Montagne et escalade</a>
                </div>

                <ul class="nav navbar-nav">
                  <li class="active"><a href="index.html">Accueil</a></li>
                  <li><a href="decouvrir.html">Découvrir</a></li>
                  <li><a href="topo.html">Topo</a></li>
                  <li><a href="article.html">Article</a></li>
                  <li><a href="site.html">Site</a></li>
                  <li><a href="forum.html">Forum</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                  <li><a href="inscription.html"><span class="glyphicon glyphicon-user"></span> Nouveau membre</a></li>
                  <li><a href="espace.html"><span class="glyphicon glyphicon-log-in"></span> Déjà membre</a></li>
                </ul>
              </div>
            </nav>
         </header>

      <section class="row" >
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
          <p class="text-left">
            Passionné d&apos;escalade ? <br />
            Débutant ou confirmé, sur ce site, vous pouvez trouver votre prochain site, <br/>reserver ou échanger des topos, partager des artcieles ou simplement discuter avec d'autres passionnés !
          </p>
          <p>
            Ce site est réalisé par des passionnés, pour des passionnés, <br />la <a href="http://www.ffme.fr"><abbr title="Fédération Française Montagne et Escalade">FFME</abbr></a> reste le seul organisme officiel délivrant les attestations nécessaires pour la pratique de ce sport.
          </p>

          <br />

		  <blockquote>
			Le meilleur grimpeur du monde, c'est celui qui prend le plus de plaisir.<br>
		    <small class="pull-right">Alex Lowe</small><br>
		   </blockquote>
        </div>
      </section>

      <section class="row">
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<img src="images/background-main.jpg" class="img-rounded" alt="grimpeur sur une montagne" />
		</div>
	  </section>

      <style>
		  #border div {
			border : 1px solid black;
			padding : 10px;
			text-align : center;
			font-variant : small-caps;
			font-size : 1.2em;
		  }

		  #border div:hover {
			background-color : maroon;
			color : white;
			cursor: pointer;
		  }

      </style>

      <section class="row" id="border">
        <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"><a href="">Découvrir l&apos;escalade</a></div>
        <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"><a href="">Trouver un site</a></div>
        <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"><a href="">Dernier Article</a></div>
        <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"><a href="">Espace de prêt</a></div>
        <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"><a href="">Trouver un topo</a></div>
        <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"><a href="">Forum</a></div>
      </section>

    </div>
  </body>
</html>
