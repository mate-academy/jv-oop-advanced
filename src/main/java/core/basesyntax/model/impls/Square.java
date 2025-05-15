package core.basesyntax.model.impls;

import core.basesyntax.model.Shape;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
