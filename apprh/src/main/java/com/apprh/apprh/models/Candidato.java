package com.apprh.apprh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Candidato {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String rg;
    @NotEmpty
    private String nomeDoCandidato;
    @NotEmpty
    private String email;
    @ManyToOne
    private Vaga vaga;
    
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getNomeDoCandidato() {
        return nomeDoCandidato;
    }
    public void setNomeDoCandidato(String nomeDoCandidato) {
        this.nomeDoCandidato = nomeDoCandidato;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Vaga getVaga() {
        return vaga;
    }
    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    
}
