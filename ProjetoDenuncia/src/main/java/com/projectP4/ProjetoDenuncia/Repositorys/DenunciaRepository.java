package com.projectP4.ProjetoDenuncia.Repositorys;

import com.projectP4.ProjetoDenuncia.Model.Denuncia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DenunciaRepository extends JpaRepository<Denuncia, Long> {
}
