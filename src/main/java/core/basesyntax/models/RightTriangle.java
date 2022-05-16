package core.basesyntax.models;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getSquare() {
        return (firstLeg * secondLeg) / 2f;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: Triangle, "
                        + "Area: %s, "
                        + "First leg: %d, "
                        + "Second leg: %d, "
                        + "Color: %s",
                getSquare(), firstLeg, secondLeg, getColor()));
    }
}
