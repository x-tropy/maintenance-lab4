package com.ae2dms.lab4.observer;

// Every observer keeps a reference to the subject it watches,
// and must say what to do when it is told that the subject changed.
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
