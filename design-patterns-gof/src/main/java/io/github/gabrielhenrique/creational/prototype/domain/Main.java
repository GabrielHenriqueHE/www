package io.github.gabrielhenrique.creational.prototype.domain;

import io.github.gabrielhenrique.creational.prototype.domain.abstracts.CloneableShape;
import io.github.gabrielhenrique.creational.prototype.domain.implementations.CloneableCircle;
import io.github.gabrielhenrique.creational.prototype.domain.implementations.Rectangle;
import io.github.gabrielhenrique.creational.prototype.domain.implementations.Circle;
import io.github.gabrielhenrique.creational.prototype.domain.abstracts.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Shape> shapes = new ArrayList<>();
//        List<Shape> shapesCopy = new ArrayList<>();
//
//        Circle circle = new Circle();
//        circle.x = 10;
//        circle.y = 20;
//        circle.radius = 15;
//        circle.color = "red";
//        shapes.add(circle);
//
//        Circle anotherCircle = (Circle) circle.clone();
//        shapesCopy.add(anotherCircle);
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.height = 10;
//        rectangle.width = 20;
//        rectangle.color = "blue";
//        shapes.add(rectangle);
//
//        cloneAndCompare(shapes, shapesCopy);

        CloneableCircle cloneableCircle = new CloneableCircle();
        cloneableCircle.x = 10;
        cloneableCircle.y = 20;
        cloneableCircle.color = "green";

        CloneableShape a = cloneableCircle.clone();
        CloneableCircle anotherCloneableCircle = cloneableCircle.clone();
        System.out.println(cloneableCircle.equals(a));
        System.out.println(a.equals(anotherCloneableCircle));
        System.out.println(anotherCloneableCircle.equals(cloneableCircle));
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        shapesCopy.addAll(shapes);

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": as formas são objetos diferentes.");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": e são idênticos.");
                } else {
                    System.out.println(i + ": mas não são idênticos.");
                }
            } else {
                System.out.println(i + ": as formas são as mesmas.");
            }
        }
    }
}
