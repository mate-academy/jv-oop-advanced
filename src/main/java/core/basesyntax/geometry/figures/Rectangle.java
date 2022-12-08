package core.basesyntax.geometry.figures;

import core.basesyntax.geometry.Figure;

public class Rectangle extends Figure {
    private static final String NAME = "rectangle";
    private int side;
    private int height;

    public Rectangle(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + calculateArea()
                + " sq.units, side: " + side + " units, height: " + height
                + " units, color: " + getColor() + "\n");
    }
}
