package com.techback.teckback.controller;

import com.techback.teckback.entity.Aluno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "https://hoppscotch.io")
@RestController
@RequestMapping("aluno")

public class AlunoController {
    List<Aluno> alunoList = new ArrayList<Aluno>();

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno){
        alunoList.add(aluno);
        return aluno;

    }
    @GetMapping
    public List<Aluno> listar(){
        return alunoList;
    }
    @DeleteMapping
    public void Remover(@PathVariable Long id){
        for (Aluno aluno:alunoList){
            if (aluno.setId().equal(id)){
            }
        }

    }
    @PutMapping
    public Atualizar(@PathVariable Long id){

    }

}

