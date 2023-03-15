package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String size;
    private  String dimensions;        // wymiary
    private boolean stamped;        // czy jest podbity

    public Stamp(String size, String dimensions, boolean stamped){
        this.dimensions = dimensions;
        this.stamped = stamped;
        this.size = size;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stamped == stamp.stamped && Objects.equals(size, stamp.size) && Objects.equals(dimensions, stamp.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, dimensions, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "size='" + size + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}
