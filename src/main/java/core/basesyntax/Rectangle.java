package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(FigureType figureType, double length, double width, Color color) {
        super(figureType, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getFigureType()
                + ", area: " + getArea() + " sq.units, "
                + "length: " + length + " units, "
                + "width: " + width + " units, "
                + "color: " + super.getColor());
    }
}
