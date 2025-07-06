package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Boleta;
import com.DBD.Grupo_11.Entity.Cliente;
import com.DBD.Grupo_11.Entity.UbicacionUsuario;
import com.DBD.Grupo_11.Repository.BoletaRepository;
import com.DBD.Grupo_11.Repository.ClienteRepository;
import com.DBD.Grupo_11.Repository.UbicacionUsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletaService {
    @Autowired
    private BoletaRepository boletaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private UbicacionUsuarioRepository ubicacionUsuarioRepository;


    public Boleta save(Boleta boleta) {
        // Recuperar cliente existente
        Cliente cliente = clienteRepository.findById(boleta.getIdCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        // Recuperar ubicación existente
        UbicacionUsuario ubicacion = ubicacionUsuarioRepository.findById(boleta.getIdUbicacion().getId())
                .orElseThrow(() -> new RuntimeException("Ubicación no encontrada"));

        // Setear entidades "conocidas" por el contexto de persistencia
        boleta.setIdCliente(cliente);
        boleta.setIdUbicacion(ubicacion);

        return boletaRepository.save(boleta);
    }
}
