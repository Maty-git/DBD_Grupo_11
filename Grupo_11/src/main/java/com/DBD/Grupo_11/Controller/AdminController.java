package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Admin;
import com.DBD.Grupo_11.Repository.AdminRepository;
import com.DBD.Grupo_11.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/saveAdmin")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return adminService.save(admin);
    }


    @GetMapping("/findByIdAdmin/{id}")
    public Object findByIdAdmin(@PathVariable Long id){
        return adminService.getById(id);
    }

    @GetMapping("/findAll")
    public List<Admin> findAll(){
        return adminService.findAll();
    }

    @PutMapping("/update")
    public void updateAdmin(@RequestBody Admin admin){
        adminService.update(admin);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdmin(@PathVariable Long id){
        adminService.delete(id);
    }

    @GetMapping("/findByIdCorreoAdmin_AndContraseniaAdmin/{correo}/{contra}")
    public Optional<Admin> findByIdCorreoAdmin_AndContraseniaAdmin(@PathVariable String correo,@PathVariable String contra){
        return adminRepository.findByIdCorreoAdmin_AndContraseniaAdmin(correo, contra);
    }
}