package com.ensa.observers;

import com.ensa.subjects.Observable;

public class Budget extends Observer {

    float disponible;
    float bloque;

    public Budget(float disponible) {
        this.disponible = disponible;
    }

    public float getDisponible() {
        return disponible;
    }

    public void setDisponible(float disponible) {
        this.disponible = disponible;
    }

    public float getBloque() {
        return bloque;
    }

    public void setBloque(float bloque) {
        this.bloque = bloque;
    }

    @Override
    public void update(Observable observable) {
        System.out.println("BUDGET A OBSERVE UN CHANGEMENT AU NIVEAU DE LA DEMANDE");
        System.out.println("SOLDE DISPONIBLE : "+disponible);
        System.out.println("SOLDE BLOQUE : "+bloque);
    }
}
