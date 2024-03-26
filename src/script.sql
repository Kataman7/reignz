CREATE TABLE paquet
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    poid INT
);

CREATE TABLE balance
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    economie   INT,
    religion   INT,
    militaire  INT,
    population INT,
    science    INT
);

CREATE TABLE consequence
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    cartes INT,
    FOREIGN KEY (cartes) REFERENCES paquet (id)
);

CREATE TABLE choix
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(400),
    consequence INT,
    FOREIGN KEY (consequence) REFERENCES consequence (id)
);

CREATE TABLE carte
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(400),
    image       VARCHAR(150),
    choixGauche INT,
    choixDroite INT,
    FOREIGN KEY (choixGauche) REFERENCES choix (id),
    FOREIGN KEY (choixDroite) REFERENCES choix (id)
);

CREATE TABLE appartenance
(
    paquet INT,
    carte  INT,
    FOREIGN KEY (paquet) REFERENCES paquet (id),
    FOREIGN KEY (carte) REFERENCES carte (id)
);

CREATE TABLE jeu
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    balance       INT,
    pioche        INT,
    carteSuivante INT,
    FOREIGN KEY (balance) REFERENCES balance (id),
    FOREIGN KEY (pioche) REFERENCES paquet (id),
    FOREIGN KEY (carteSuivante) REFERENCES paquet (id)
);

CREATE TABLE utilisateur
(
    id  INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50),
    mdp VARCHAR(50),
    jeu int,
    FOREIGN KEY (jeu) REFERENCES jeu (id)
)

