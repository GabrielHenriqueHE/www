package io.github.gabrielhenrique.creational.prototype.domain.implementations;

import io.github.gabrielhenrique.creational.prototype.domain.abstracts.CloneableShape;

public class CloneableCircle extends CloneableShape {
    public int radius;

    public CloneableCircle() {
    }

    @Override
    public CloneableCircle clone() {
        return (CloneableCircle) super.clone();
    }

    @Override
    public String toString() {
        return "CloneableCircle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
