package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstPSide;
    private int secondPSide;
    private int height;

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    public IsoscelesTrapezoid(String color, int firstPSide, int secondPSide, int height) {
        super(color);
        this.firstPSide = firstPSide;
        this.secondPSide = secondPSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstPSide + secondPSide) / 2) * height;
    }

    @Override
    public void draw() {
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: isosceles trapezoid, area: " + area + " sq., color: " + color);
    }
}
