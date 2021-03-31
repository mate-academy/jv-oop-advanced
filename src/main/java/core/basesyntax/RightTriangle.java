package core.basesyntax;

public class RightTriangle extends Figure {
    private int legOne;
    private int legTwo;
    private int hypotenuse;

    public RightTriangle(int legOne, int legTwo, int hypotenuse, String color, String property) {
        super(color, property);
        this.legOne = legOne;
        this.legTwo = legTwo;
        this.hypotenuse = hypotenuse;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        return (0.5 * legOne * legTwo);
    }

    @Override
    public String draw() {
        return "Figure{RightTriangle , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + getProperty() + ": " + hypotenuse
                + " units, color: " + getColor()
                + '}';
    }
}
