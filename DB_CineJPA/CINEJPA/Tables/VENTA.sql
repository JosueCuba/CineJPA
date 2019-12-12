CREATE TABLE cinejpa.venta (
  idvent NUMBER NOT NULL,
  fecvent DATE,
  totvent NUMBER(10),
  idcli NUMBER,
  idper NUMBER,
  idpel NUMBER,
  CONSTRAINT venta_pk PRIMARY KEY (idvent),
  CONSTRAINT venta_fk1 FOREIGN KEY (idper) REFERENCES cinejpa.personal (idper),
  CONSTRAINT venta_fk2 FOREIGN KEY (idcli) REFERENCES cinejpa.cliente (idcli),
  CONSTRAINT venta_fk3 FOREIGN KEY (idpel) REFERENCES cinejpa.pelicula (idpel)
);