package com.cattery.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping
    public Object index() {
        Iterable<Role> roles = roleRepository.findAll();
        return roles;
    }

    @PutMapping
    public Object update(@RequestParam(name = "role") Role role) {
        roleRepository.save(role);
        return role;
    }

    @PostMapping
    public Object create(@RequestParam(name = "name") String name) {
        Role role = new Role();
        role.setName(name);
        roleRepository.save(role);
        return role;
    }

    @DeleteMapping
    public Object delete(@RequestParam(name = "id") Long id) {
        roleRepository.deleteById(id);
        return id;
    }
}
