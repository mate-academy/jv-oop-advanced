package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("This is Right Triangle; Color: "
                + color + "; area: " + getArea() + ";");

    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
