package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double lineLength;
    private double lineWindth;

    public Rectangle(String color, double lineLength, double lineWindth) {
        super(color);
        this.lineLength = lineLength;
        this.lineWindth = lineWindth;
    }

    @Override
    public double getArea() {
        return lineLength * lineWindth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle" + ", color= " + color
                + ", area= " + getArea()
                + " unit sq., Length A=" + lineLength
                + " unit sq., Windth B= " + lineWindth + " unit sq.");
    }
}
