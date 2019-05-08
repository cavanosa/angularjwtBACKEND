package com.inezpre5.angularjwt.repository;

import com.inezpre5.angularjwt.entity.Rol;
import com.inezpre5.angularjwt.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
