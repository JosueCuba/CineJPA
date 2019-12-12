CREATE TABLE cinejpa.cliente (
  idcli NUMBER NOT NULL,
  nomcli VARCHAR2(100 BYTE),
  apepatcli VARCHAR2(100 BYTE),
  apematcli VARCHAR2(100 BYTE),
  sexcli CHAR NOT NULL,
  CONSTRAINT cliente_pk PRIMARY KEY (idcli)
);