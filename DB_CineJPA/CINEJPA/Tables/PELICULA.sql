CREATE TABLE cinejpa.pelicula (
  idpel NUMBER NOT NULL,
  titpel VARCHAR2(100 BYTE),
  durcpel VARCHAR2(10 BYTE),
  fecestnpel DATE,
  estpel CHAR DEFAULT 'A',
  paispel VARCHAR2(50 BYTE),
  idgen NUMBER,
  clsfpel VARCHAR2(50 BYTE),
  CONSTRAINT pelicula_pk PRIMARY KEY (idpel),
  CONSTRAINT pelicula_fk1 FOREIGN KEY (idgen) REFERENCES cinejpa.genero (idgen)
);