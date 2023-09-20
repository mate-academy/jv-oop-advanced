package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle | height: " + String.format("%.2f", height)
                 + " | width: " + String.format("%.2f", width)
                 + " | area: " + String.format("%.2f", calculateArea())
                 + " | color: " + getColor());
    }
}
