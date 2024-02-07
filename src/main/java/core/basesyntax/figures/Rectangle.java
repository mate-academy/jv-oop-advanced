package core.basesyntax.figures;

public class Rectangle extends GeometricFigure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("GeometricFigure: rectangle, area: " + getArea()
                + " sq.units," + " width: " + width + " units, length: "
                + length + " units, color: " + getColor());
    }
}
