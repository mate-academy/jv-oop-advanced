package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide = 0;
    private double secondSide = 0;
    private double height = 0;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public String draw() {
        return super.draw() + System.out.printf("FirstSide: %s, SecondSide: %s, Height: %s",
                firstSide, secondSide, height);
    }
}
