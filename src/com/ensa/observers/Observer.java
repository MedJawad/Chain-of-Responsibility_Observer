package com.ensa.observers;

import com.ensa.subjects.Observable;

public abstract class Observer {
    public abstract void update(Observable observable);
}
