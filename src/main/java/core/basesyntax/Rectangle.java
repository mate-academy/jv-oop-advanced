package core.basesyntax;

public class Rectangle extends Figure implements Calculable, Printable {
    private int width;
    private int height;
    private double area;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
        this.area = areaCalculation();
    }

    @Override
    public double areaCalculation() {
        return width * height;
    }

    @Override
    public void print() {
        System.out.println("Figure: rectangle, area: " + this.area
                + " sq.units, width: " + this.width + " units, height: "
                + this.height + " units, color: " + getColor());
    }
}
