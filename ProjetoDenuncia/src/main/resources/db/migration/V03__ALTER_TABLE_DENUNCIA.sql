ALTER TABLE Denuncia
    ADD CONSTRAINT chk_hospital
    CHECK (local IN ('H1','H2','H3','H4','H5'));