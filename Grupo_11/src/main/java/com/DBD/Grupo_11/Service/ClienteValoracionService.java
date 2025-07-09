package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.ClienteValoracion;
import com.DBD.Grupo_11.Repository.ClienteValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteValoracionService {

    @Autowired
    private ClienteValoracionRepository clienteValoracionRepository;

    public List<ClienteValoracion> getAll() {
        return clienteValoracionRepository.findAll();
    }

    public Optional<ClienteValoracion> getById(Long id) {
        return clienteValoracionRepository.findById(id);
    }

    public ClienteValoracion save(ClienteValoracion clienteValoracion) {
        return clienteValoracionRepository.save(clienteValoracion);
    }

    public Optional<ClienteValoracion> update(Long id, ClienteValoracion nuevosDatos) {
        return clienteValoracionRepository.findById(id).map(cv -> {
            cv.setCliente(nuevosDatos.getCliente());
            cv.setValoracion(nuevosDatos.getValoracion());
            return clienteValoracionRepository.save(cv);
        });
    }

    public void deleteById(Long id) {
        clienteValoracionRepository.deleteById(id);
    }
}
