package com.example;


import java.util.HashMap;

public class Component<K,V> extends Framework<K,V> {
    @Override
    void activate() {
        HashMap<K,V> someMap = getProperties();
    }
}
