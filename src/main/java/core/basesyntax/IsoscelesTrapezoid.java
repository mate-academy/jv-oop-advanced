package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideOne;
    private final double sideTwo;
    private final double height;

    public IsoscelesTrapezoid(String name, double sideOne,
                              double sideTwo, double height, String color) {
        super(name, color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((sideOne + sideTwo) / 2) * height;
    }

    @Override
    public String draw() {
        return "Name = " + getName() + " Area = " + calculateArea()
                + " First side = " + sideOne + " Second side = " + sideTwo
                + " Height = " + height + " Color = " + getColor();
    }
}
