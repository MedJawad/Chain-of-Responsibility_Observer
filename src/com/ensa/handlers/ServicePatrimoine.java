package com.ensa.handlers;

import com.ensa.DemandeEnum;
import com.ensa.subjects.Demande;

public class ServicePatrimoine extends AbstractHandler {
    @Override
    public void handle(Demande demande) {
        float disponible = demande.getDepartement().getBudget().getDisponible();
        float bloque = demande.getDepartement().getBudget().getBloque();
        float montant_demande = demande.getMontant_global();
        demande.getDepartement().getBudget().setBloque(bloque - montant_demande);
        demande.getDepartement().getBudget().setDisponible(disponible - montant_demande);
        demande.setState(DemandeEnum.DONE.toString());
        System.out.println("Service Patrimoine a traité la demande");
    }
}
