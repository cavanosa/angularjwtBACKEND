package com.inezpre5.angularjwt.service;

import com.inezpre5.angularjwt.entity.Rol;
import com.inezpre5.angularjwt.enums.RolNombre;
import com.inezpre5.angularjwt.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
}
