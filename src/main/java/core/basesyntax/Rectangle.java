package core.basesyntax;

public class Rectangle extends FigureBase {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double wigth) {
        super(color);
        this.length = length;
        this.width = wigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: " + length
                + " units, width: " + width + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
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

    public double getWigth() {
        return width;
    }

    public void setWigth(double wigth) {
        this.width = wigth;
    }
}
