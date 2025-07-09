package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Carta;
import com.DBD.Grupo_11.Repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CartaService {
    @Autowired
    private CartaRepository cartaRepository;

    public List<Carta> getAll(){
        return cartaRepository.findAll();
    }

    public Optional<Carta> getById(Long id){
        return cartaRepository.findById(id);
    }

    public Carta save(Carta carta){
        return cartaRepository.save(carta);
    }

    public Optional<Carta> update(Long id, Carta datosActualizados) {
        return cartaRepository.findById(id).map(carta -> {
            carta.setAnnoCarta(datosActualizados.getAnnoCarta());
            carta.setEstadoCarta(datosActualizados.getEstadoCarta());
            carta.setRarezaCarta(datosActualizados.getRarezaCarta());
            carta.setTipoDeJuego(datosActualizados.getTipoDeJuego());
            carta.setProducto(datosActualizados.getProducto());

            return cartaRepository.save(carta);
        });
    }

    public void deleteById(Long id){
        cartaRepository.deleteById(id);
    }
}
