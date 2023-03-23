package com.hackathon.showrural.hackathon.service.empresa;

import com.hackathon.showrural.hackathon.domain.empresa.Empresa;
import com.hackathon.showrural.hackathon.repository.empresa.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmpresaService {
    final EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }
    public Empresa getById(Long id){
        Optional<Empresa> empresa = empresaRepository.findById(id);
        return empresa.orElse(null);
    }
    public List<Empresa> getAll(){
        return empresaRepository.findAll();
    }
}
