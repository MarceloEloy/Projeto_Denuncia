package com.projectP4.ProjetoDenuncia.Services;

import com.projectP4.ProjetoDenuncia.Model.DTO.DenunciaDTO;
import com.projectP4.ProjetoDenuncia.Model.Denuncia;
import com.projectP4.ProjetoDenuncia.Repositorys.DenunciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DenunciaService {

    @Autowired
    DenunciaRepository denunciaRepository;

    public ResponseEntity<Denuncia> post(DenunciaDTO dto){
        return ResponseEntity.ok().body(denunciaRepository.save(new Denuncia(dto)));
    };

}
