CREATE TABLE Billett
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    film VARCHAR (255),
    antall INTEGER NOT NULL,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    telefonnr INTEGER NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);