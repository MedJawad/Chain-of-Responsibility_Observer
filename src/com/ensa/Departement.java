package com.ensa;

import com.ensa.observers.Budget;

public class Departement {
    Budget budget;

    public Departement(Budget budget) {
        this.budget = budget;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}
