package core.basesyntax.figure;

import core.basesyntax.FigureAction;

public class Rectangle extends Figure implements FigureAction {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + " area: "  + getArea() + "sq.units,"
                +  " width: " + width + " units,"
                + " height: " + height + " unit,"
                + " color: " + getColor());    }
}
