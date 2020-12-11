package com.ensa.handlers;

import com.ensa.DemandeEnum;
import com.ensa.subjects.Demande;

public class ServiceComptable extends AbstractHandler{

    @Override
    public void handle(Demande demande) {
        float disponible = demande.getDepartement().getBudget().getDisponible();
        float bloque = demande.getDepartement().getBudget().getBloque();
        float montant_demande = demande.getMontant_global();
        if(disponible-bloque-montant_demande>0){
            demande.getDepartement().getBudget().setBloque(bloque+montant_demande);
            demande.setState(DemandeEnum.APPROVED.toString());
            System.out.println("Service Comptable a approuvé la demande");
            this.nextHandler.handle(demande);
        }else{
            System.out.println("La demande dépasse le budget disponible non bloqué du département");
            demande.setState(DemandeEnum.CANCELLED.toString());
        }
    }
}
