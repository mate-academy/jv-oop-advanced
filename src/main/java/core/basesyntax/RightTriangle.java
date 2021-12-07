package core.basesyntax;

public class RightTriangle extends Figure {

    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle, color: " + color.toString()
                + ", first leg: " + firstLeg
                + ", second leg: " + secondLeg
                + ", area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }
}
