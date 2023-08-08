package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public String draw() {
        return super.draw() + System.out.printf("FirstSide: %s, SecondSide: %s, Height: %s",
                firstSide, secondSide, height);
    }
}
