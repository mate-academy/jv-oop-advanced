package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double areaCalculation() {
        return this.length * this.width;
    }

    @Override
    public void display() {
        System.out.println("Figure: " + name() + ", area: " + areaCalculation()
                + " sq.units, length: " + this.length + " units, width: "
                + this.width + " units, color: " + getColor());
    }

    @Override
    public String name() {
        return Figures.RECTANGLE.name();
    }
}
