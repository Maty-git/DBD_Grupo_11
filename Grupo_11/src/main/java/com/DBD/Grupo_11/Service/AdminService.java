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

    public Object getById(Long id){
        return adminRepository.findById(id);
    }

    public List<Admin> findAll(){
        return adminRepository.findAll();
    }

    public Admin update(Admin adminupdate){
        return  adminRepository.save(adminupdate);
    }

    public void delete(Long id){
        adminRepository.deleteById(id);
    }
}
