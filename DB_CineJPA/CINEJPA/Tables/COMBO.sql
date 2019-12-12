CREATE TABLE cinejpa.combo (
  idcomb NUMBER NOT NULL,
  nomcomb VARCHAR2(100 BYTE),
  desccomb VARCHAR2(100 BYTE),
  preccomb NUMBER(*,0),
  CONSTRAINT combo_pk PRIMARY KEY (idcomb)
);