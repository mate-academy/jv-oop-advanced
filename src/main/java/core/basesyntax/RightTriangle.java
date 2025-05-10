package core.basesyntax;

public class RightTriangle extends Figure {
    private int legOne;
    private int legTwo;

    public RightTriangle(int legOne, int legTwo, String color) {
        super(color);
        this.legOne = legOne;
        this.legTwo = legTwo;
    }

    @Override
    public double calculateArea() {
        return (0.5 * legOne * legTwo);
    }

    @Override
    public String draw() {
        return "Figure{RightTriangle , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + "leg one: " + legOne
                + " units, color: " + getColor()
                + '}';
    }
}
