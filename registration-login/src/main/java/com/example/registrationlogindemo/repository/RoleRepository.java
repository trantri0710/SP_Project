package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
// Cac phuong thuc tim kiem va thao tac du lieu khac se đuoc tu đong tao ra
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
