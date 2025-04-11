package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstB;
    private double secondB;
    private double height;
    private String color;

    public IsoscelesTrapezoid(String color, double firstB, double secondB, double height) {
        super(color);
        this.color = color;
        this.firstB = firstB;
        this.secondB = secondB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, first base: " + getFirstB()
                + " units, second base: " + getSecondB()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstB + secondB) * height / 2;
    }

    public double getFirstB() {
        return firstB;
    }

    public double getSecondB() {
        return secondB;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
