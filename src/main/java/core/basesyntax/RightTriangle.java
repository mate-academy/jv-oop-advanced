package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCounter {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String colour, int firstLeg, int secondLeg) {
        super(colour);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first side: "
                + firstLeg + " units, second side: " + secondLeg + " units, colour: " + colour);
    }
}
