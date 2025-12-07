package com.projectP4.ProjetoDenuncia.Controller;

import com.projectP4.ProjetoDenuncia.Model.DTO.DenunciaDTO;
import com.projectP4.ProjetoDenuncia.Model.Denuncia;
import com.projectP4.ProjetoDenuncia.Services.DenunciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Denuncias")
public class DenunciaController {
    @Autowired
    DenunciaService denunciaService;


    @PostMapping(path = "/Denunciar")
    public ResponseEntity<Denuncia> post(@RequestBody DenunciaDTO dto){
        return denunciaService.post(dto);
    }
}
