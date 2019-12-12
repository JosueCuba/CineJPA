CREATE TABLE cinejpa.funcion (
  idfunc NUMBER NOT NULL,
  horfunc VARCHAR2(20 BYTE),
  idpel NUMBER NOT NULL,
  idsal NUMBER NOT NULL,
  idcart NUMBER,
  CONSTRAINT funcion_pk PRIMARY KEY (idfunc),
  CONSTRAINT funcion_fk1 FOREIGN KEY (idpel) REFERENCES cinejpa.pelicula (idpel),
  CONSTRAINT funcion_fk2 FOREIGN KEY (idsal) REFERENCES cinejpa.sala (idsal),
  CONSTRAINT funcion_fk3 FOREIGN KEY (idcart) REFERENCES cinejpa.cartelera (idcart)
);