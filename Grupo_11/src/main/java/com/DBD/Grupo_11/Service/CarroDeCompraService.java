package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.CarroDeCompra;
import com.DBD.Grupo_11.Repository.CarroDeCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroDeCompraService {
    @Autowired
    private CarroDeCompraRepository carroDeCompraRepository;

    public List<CarroDeCompra> getAll(){
        return carroDeCompraRepository.findAll();
    }

    public Optional<CarroDeCompra> getById(Long id){
        return carroDeCompraRepository.findById(id);
    }

    public CarroDeCompra save(CarroDeCompra carroDeCompra){
        return carroDeCompraRepository.save(carroDeCompra);
    }

    public void deleteById(Long id){
        carroDeCompraRepository.deleteById(id);
    }
}
