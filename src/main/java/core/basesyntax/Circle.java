package core.basesyntax;

public class Circle extends Figure implements Calculable, Printable {
    private int radius;
    private double area;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        this.area = areaCalculation();
    }

    @Override
    public double areaCalculation() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: circle, area: " + this.area + " sq.units, radius: "
                + this.radius + " units, color: " + getColor());
    }
}
