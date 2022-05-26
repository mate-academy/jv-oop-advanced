package core.basesyntax.figures.figure;

import core.basesyntax.figures.Rectangles;

public class Rectangle extends Rectangles {
    public Rectangle(String color, int sideA, int sideB) {
        super(color, sideA, sideB);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public int getSideA() {
        return super.getSideA();
    }

    @Override
    public void setSideA(int sideA) {
        super.setSideA(sideA);
    }

    @Override
    public int getSideB() {
        return super.getSideB();
    }

    @Override
    public void setSideB(int sideB) {
        super.setSideB(sideB);
    }
}
