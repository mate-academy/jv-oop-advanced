package core.basesyntax;

public class RightTriangle extends Figure implements Area, Draw {
    private int firstLeg;
    private int secondLeg;
    private final static String NAME = "RightTriangle";

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
        System.out.println("Figure: " + NAME + ", area: " + printArea() + " sq. units, first leg: " + firstLeg + " units, second leg: " + secondLeg + " units, color: " + getColor());
    }
}
