package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super("rectangle", color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print("length: " + length
                + " units, width: " + width + " units"
                + System.lineSeparator());
    }
}
