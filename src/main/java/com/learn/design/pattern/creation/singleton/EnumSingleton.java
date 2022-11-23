package com.learn.design.pattern.creation.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void check() {
        System.out.println("enum create singleton object: " + this.hashCode());
    }
}
