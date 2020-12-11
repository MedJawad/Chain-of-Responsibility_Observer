package com.ensa.subjects;

import com.ensa.DemandeEnum;
import com.ensa.Departement;

public class Demande extends Observable {

    String state= DemandeEnum.CREATED.toString();
    float montant_global;
    Departement departement;

    public Demande(float montant_global, Departement departement) {
        this.montant_global = montant_global;
        this.departement = departement;
        this.subscribe(departement.getBudget());

    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
    public float getMontant_global() {
        return montant_global;
    }

    public void setMontant_global(float montant_global) {
        this.montant_global = montant_global;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

}
