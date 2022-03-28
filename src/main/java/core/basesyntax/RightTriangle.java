package core.basesyntax;

public class RightTriangle extends Figure implements Area,Draw {
    private String color;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return Math.rint((firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right Triangle, area: " + area()
                + " sq.units, firs leg: " + firstLeg + " units, " + secondLeg + " units, color "
                + color);
    }
}
