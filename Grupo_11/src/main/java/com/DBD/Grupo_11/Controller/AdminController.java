package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Admin;
import com.DBD.Grupo_11.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

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
}