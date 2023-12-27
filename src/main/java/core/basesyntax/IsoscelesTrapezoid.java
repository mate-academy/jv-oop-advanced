package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int thirdSide) {
        super(color, firstSide, secondSide, thirdSide);
        height = 0.5 * (Math.abs(4 * Math.pow(thirdSide, 2)
                - Math.pow((firstSide - secondSide), 2)));
    }

    @Override
    public double calculateArea() {
        return 0.5 * (getFirstSide() + getSecondSide()) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + calculateArea()
                + " sq. units, small side: " + getFirstSide()
                + " units, big side: " + getSecondSide() + " units, left or right side: "
                + getThirdSide() + " units, color: " + getColor());
    }
}
