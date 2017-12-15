CREATE TABLE utilisateur(
	IdUtilisateur INT PRIMARY KEY,
	pseudo VARCHAR(20),
	naissance DATE,
	mdp VARCHAR(20),
	experience VARCHAR(20),
	nbArticles INT 
	nbTopos INT,
	nbSites INT,
	nbCommentaires INT,
) engine=InnoDB;

CREATE TABLE contact(
	idContact INT PRIMARY KEY,
	nom VARCHAR(20),
	prenom VARCHAR(20),
	email VARCHAR(30), 
	telephone INT 
) engine=InnoDB;

CREATE TABLE topo(
	idTopo INT PRIMARY KEY,
	nom VARCHAR(20),
	region VARCHAR(20),
	proprietaire VARCHAR(20),
	disponibilite VARCHAR(3), 
	dateDisponible DATE 
);

CREATE TABLE site(
	idSite INT PRIMARY KEY,
	nom VARCHAR(20),	
	nbSecteurs INT
);

CREATE TABLE secteur(
	idSecteur INT PRIMARY KEY,
	nom VARCHAR(20),	
	nbVoies INT
);

CREATE TABLE voie(
	idVoie INT PRIMARY KEY,
	nom VARCHAR(20),	
	hauteur INT
	cotation VARCHAR(20)
	nbPoints INT
	nbLongueurs INT
	nbRelais INT
);

CREATE TABLE articles(
	idArticles INT PRIMARY KEY,
	nom VARCHAR(20),	
	auteur VARCHAR(20),
	dateArticle DATE,
	contenu VARCHAR(500)
);

CREATE TABLE commentaires(
	idCommentaire INT PRIMARY KEY,
	auteur VARCHAR(20),	
	dateCommentaire VARCHAR(20),
	message VARCHAR(300)
);



