CREATE TABLE cinejpa.personal (
  idper NUMBER NOT NULL,
  nomper VARCHAR2(100 BYTE),
  apepatper VARCHAR2(100 BYTE),
  apematper VARCHAR2(100 BYTE),
  fecreper DATE,
  estper CHAR DEFAULT 'A',
  CONSTRAINT personal_pk PRIMARY KEY (idper)
);