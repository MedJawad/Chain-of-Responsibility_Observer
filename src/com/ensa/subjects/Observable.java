package com.ensa.subjects;

import com.ensa.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    List<Observer> observers = new ArrayList<Observer>();

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract String getState();

    public abstract void setState(String state);
}
