CREATE TABLE cinejpa.detalleventa (
  iddetvent NUMBER NOT NULL,
  precio NUMBER,
  cantdetvent NUMBER,
  idcomb NUMBER,
  idvent NUMBER,
  CONSTRAINT detalleventa_pk PRIMARY KEY (iddetvent),
  CONSTRAINT detalleventa_fk1 FOREIGN KEY (idcomb) REFERENCES cinejpa.combo (idcomb),
  CONSTRAINT detalleventa_fk2 FOREIGN KEY (idvent) REFERENCES cinejpa.venta (idvent)
);