package com.example;


import java.util.HashMap;

abstract class Framework<K, V> {
    public HashMap<K, V> getProperties() {
        return null;
    }
    abstract void activate();
}
