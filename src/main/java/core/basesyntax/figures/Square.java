package core.basesyntax.figures;

import core.basesyntax.Figure;

import java.awt.*;

public class Square extends Figure {

    private double firstline;

    public Square() {
    }

    public Square(String name, String color, double firstline) {
        super(name, color);
        this.firstline = firstline;
    }

    @Override
    public double getArea() {
        return firstline * firstline;
    }

    @Override
    public void drow() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + getArea()
                + " unit sq., Length A=" + firstline + " unit sq.");
    }
}
