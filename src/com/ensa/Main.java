package com.ensa;

import com.ensa.handlers.AbstractHandler;
import com.ensa.handlers.ServiceComptable;
import com.ensa.handlers.ServicePatrimoine;
import com.ensa.observers.Budget;
import com.ensa.observers.Observer;
import com.ensa.subjects.Demande;
import com.ensa.subjects.Observable;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Departement crée une demande,
        Budget bg = new Budget(10000);
        Departement dpt = new Departement(bg);
        Demande demande = new Demande(6000,dpt);
        Demande demande2 = new Demande(5000,dpt);

        AbstractHandler srvcComptable = new ServiceComptable();
        AbstractHandler srvcPatrimoine = new ServicePatrimoine();
        srvcComptable.setNext(srvcPatrimoine);
        srvcComptable.handle(demande);
        srvcComptable.handle(demande2);








//        Observable demande = new Demande();
//        Observer budget = new Budget();
//        demande.subscribe(budget);
//        demande.setState("STARTED");
//        demande.setState("LOADING");
//        demande.setState("LOADED");
//        demande.setState("FINISHED");
//        demande.unsubscribe(budget);
//        demande.setState("STARTED");
//        demande.setState("LOADING");
//        demande.setState("LOADED");
//        demande.setState("FINISHED");
//        System.out.println("PROGRAM DONE");
    }
}
