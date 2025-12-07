package com.projectP4.ProjetoDenuncia.Model;

import com.projectP4.ProjetoDenuncia.Model.DTO.DenunciaDTO;
import com.projectP4.ProjetoDenuncia.Model.Nurse.Hospital;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Denuncia")
@Entity
@Data
public class Denuncia {
    public Denuncia(DenunciaDTO dto){
        this.id = dto.id();
        this.menssage = dto.message();
        this.local = dto.local();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "message")
    private String menssage;

    @Enumerated(EnumType.STRING)
    private Hospital local;
}
