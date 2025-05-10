package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, color: "
                + getColor().toString().toLowerCase()
                + ", area: " + Math.round(getArea())
                + " sq. units, length: " + length
                + " units, width: " + width + " units");
    }
}
