package com.ensa.handlers;

import com.ensa.subjects.Demande;

public abstract class AbstractHandler {
    AbstractHandler nextHandler;
    public void setNext(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    public abstract void handle(Demande demande);
}
