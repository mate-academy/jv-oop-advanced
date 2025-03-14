package core.basesyntax;

public class RightTriangle extends Figure implements Area, Draw {
    private int firstLeg;
    private int secondLeg;
    private static final String NAME = "RightTriangle";

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double printArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: " + NAME + ", area: " + printArea();
        String secondPart = " sq. units, first leg: " + firstLeg + " units, second leg: ";
        String thirdPart = secondLeg + " units, color: " + getColor();
        System.out.println(firstPart + secondPart + thirdPart);
    }
}
