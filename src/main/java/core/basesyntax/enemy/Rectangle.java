package core.basesyntax.enemy;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Width - " + width 
                            + "Height - " + height
                            + "Color - " + color
        );
    }
}
