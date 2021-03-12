package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    protected Rectangle() {
    }

    protected Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    protected double getLength() {
        return length;
    }

    protected void setLength(double length) {
        this.length = length;
    }

    protected double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%.1f%s%s",
                "Figure: rectangle, area: ", this.getArea(), " sq. units, length: ",
                this.getLength(), " units, width: ",
                this.getWidth(), " units, color: ", this.getColor()));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public Figure getRandomFigure() {
        return new Rectangle(ColorSupplier.colorGenerator(),
                Math.random() * 100, Math.random() * 100);
    }
}
