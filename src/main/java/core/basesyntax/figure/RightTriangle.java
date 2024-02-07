package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        String figureName = "right triangle";
        String message = "Figure: " + figureName + ", area: " + getArea() + " sq.units,"
                + " firstLeg: " + firstLeg + "units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
        System.out.println(message);
    }
}
