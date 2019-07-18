package com.example.spell3.entity;

public enum WordLength {
    FOUR("FOUR"),
    FIVE("FIVE");


    public static final WordLength[] ALL = {FOUR, FIVE};

    private final String name;
    private WordLength(final String name) {
        this.name = name();
    }

    public static WordLength forName(final String name) {

        if (name == null) {
            throw new IllegalArgumentException("Name can be null for WordLength");

        }
        if (name.toUpperCase().equals("FOUR")) {
            return FOUR;
        } else if (name.toUpperCase().equals("FIVE")) {
            return FIVE;
        }
        throw new IllegalArgumentException("name \"" + name + "\" does not correspond to any number");


    }



    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName();
    }

}
