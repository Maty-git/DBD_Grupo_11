package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.JuegoDeMesa;
import com.DBD.Grupo_11.Repository.JuegoDeMesaRepository;
import com.DBD.Grupo_11.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JuegoDeMesaService {
    @Autowired
    private JuegoDeMesaRepository juegoDeMesaRepository;
    @Autowired
    private ProductoRepository productoRepository;

    public List<JuegoDeMesa> findAll() { return juegoDeMesaRepository.findAll(); }

    public JuegoDeMesa getById(Long id) {
        return juegoDeMesaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));
    }

    public JuegoDeMesa save(JuegoDeMesa juegoDeMesa) {
        juegoDeMesaRepository.save(juegoDeMesa);
        return juegoDeMesa;
    }

    public void update(JuegoDeMesa juegoDeMesaUpdate) {
        Long idJuegoDeMesa = juegoDeMesaUpdate.getIdJuegoDeMesa();
        JuegoDeMesa juegoDeMesa = getById(idJuegoDeMesa);

        juegoDeMesa.setTipoJuegoMesa(juegoDeMesaUpdate.getTipoJuegoMesa());
        juegoDeMesa.setTipoDeJuego(juegoDeMesaUpdate.getTipoDeJuego());
        juegoDeMesa.setIdProducto(juegoDeMesaUpdate.getIdProducto());

        juegoDeMesaRepository.save(juegoDeMesa);
    }

    public void delete(Long id) {
        juegoDeMesaRepository.deleteById(id);
    }
}
