package core.basesyntax;

public class Square extends FigureBase {
    private double length;

    public Square(Color color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, length: " + length
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
