package com.projectP4.ProjetoDenuncia.Model.DTO;

import com.projectP4.ProjetoDenuncia.Model.Nurse.Hospital;

public record DenunciaDTO(

        Long id,

        String message,

        Hospital local

) {
}
