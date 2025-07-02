package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Admin;
import com.DBD.Grupo_11.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin save(Admin admin) {
        adminRepository.save(admin);
        return admin;
    }

    public Admin getById(Long id){
        return adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin no encontrado con ID: " + id));
    }

    public List<Admin> findAll(){
        return adminRepository.findAll();
    }

    public void update(Admin adminupdate){
        Long idAdmin = adminupdate.getIdAdmin();
        Admin admin = getById(idAdmin);

        admin.setIdCorreoAdmin(adminupdate.getIdCorreoAdmin());
        admin.setNombreAdmin(adminupdate.getNombreAdmin());
        admin.setUbicacionAdmin(adminupdate.getUbicacionAdmin());
        admin.setContraseniaAdmin(adminupdate.getContraseniaAdmin());
        admin.setIdPermiso(adminupdate.getIdPermiso());
        adminRepository.save(admin);
    }

    public void delete(Long id){
        adminRepository.deleteById(id);
    }
}
