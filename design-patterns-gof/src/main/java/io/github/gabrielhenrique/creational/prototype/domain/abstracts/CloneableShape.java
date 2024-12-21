package io.github.gabrielhenrique.creational.prototype.domain.abstracts;

import java.util.Objects;

public abstract class CloneableShape implements Cloneable {

    public int x;
    public int y;
    public String color;

    public CloneableShape() {
    }

    @Override
    public CloneableShape clone() {
        try {
            return (CloneableShape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CloneableShape that = (CloneableShape) o;
        return x == that.x && y == that.y && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }

    @Override
    public String toString() {
        return "CloneableShape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
