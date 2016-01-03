package com.example;

import java.util.HashMap;

public class TestableComponent<K,V> extends Component<K,V> {

    private final HashMap<K, V> mapWithTestValues;

    public TestableComponent(HashMap<K, V> mapWithTestValues) {
        this.mapWithTestValues = mapWithTestValues;
    }
    @Override
    public HashMap<K, V> getProperties() {
        return mapWithTestValues;
    }
}
