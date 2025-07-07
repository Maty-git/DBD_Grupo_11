package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private TiendaRepository tiendaRepository;

    @Autowired
    private JefeDeTiendaRepository jefeDeTiendaRepository;

    @Autowired
    private UbicacionUsuarioRepository ubicacionUsuarioRepository;

    @Autowired
    private UbicacionTiendaRepository ubicacionTiendaRepository;


}
