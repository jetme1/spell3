package com.example.spell3.entity;

public enum WordLength {
    FIVE("FIVE"),
    SIX("SIX"),
    SEVEN("SEVEN"),
    EIGHT("EIGHT"),
    NINE("NINE"),
    TEN("TEN"),
    ELEVEN("ELEVEN"),
    TWELVE("TWELVE"),
    THIRTEEN("THIRTEEN"),
    FOURTEEN("FOURTEEN");
    public static final WordLength[] ALL = {FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, THIRTEEN, FOURTEEN};

    private final String name;

    private WordLength(final String name) {
        this.name = name();
    }

    public static WordLength forName(final String name) {

        if (name == null) {
            throw new IllegalArgumentException("Name can be null for WordLength");

        }
        if (name.toUpperCase().equals("FIVE")) {
            return FIVE;
        } else if (name.toUpperCase().equals("SIX")) {
            return SIX;
        } else if (name.toUpperCase().equals("SEVEN")) {
            return SEVEN;
        } else if (name.toUpperCase().equals("EIGHT")) {
            return EIGHT;
        } else if (name.toUpperCase().equals("NINE")) {
            return NINE;
        } else if (name.toUpperCase().equals("TEN")) {
            return TEN;

        } else if (name.toUpperCase().equals("ELEVEN")) {
            return ELEVEN;

        } else if (name.toUpperCase().equals("TWELVE")) {
            return TWELVE;

        } else if (name.toUpperCase().equals("THIRTEEN")) {
            return THIRTEEN;
        } else if (name.toUpperCase().equals("FOURTEEN")) {
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
