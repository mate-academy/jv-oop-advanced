package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double recWidth;
    private double recLength;

    public Rectangle(String color, double recWidth, double recLength) {
        super(color);
        this.recWidth = recWidth;
        this.recLength = recLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, " + "area: " + calculateArea()
                           + " sq. units, width: " + recWidth
                           + ", length: " + recLength
                           + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return recWidth * recLength;
    }
}
