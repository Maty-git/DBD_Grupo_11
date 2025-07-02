package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Boleta;
import com.DBD.Grupo_11.Repository.AdminRepository;
import com.DBD.Grupo_11.Repository.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletaService {
    @Autowired
    private BoletaRepository boletaRepository;

    public void save(Boleta boleta){
        boletaRepository.save(boleta);
    }
}
