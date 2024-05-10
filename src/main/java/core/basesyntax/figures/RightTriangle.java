package core.basesyntax.figures;

public class RightTriangle extends Figure{
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg > secondLeg ? firstLeg : secondLeg;
        this.secondLeg = secondLeg < firstLeg ? secondLeg : firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * Math.sqrt(firstLeg * firstLeg - secondLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: "
                + "triangle, area: " +  (double) ((long) (getArea() * 10)) / 10 + " sq. units,"
                + " firstLeg: " + firstLeg + " units,"
                + " secondtLeg: " + secondLeg + " units,"
                + " color: "  + getColor()
        );
    }
}
