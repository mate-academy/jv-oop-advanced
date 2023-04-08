package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int thirdLeg;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int thirdLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    @Override
    public double getArea() {
        return (double) (((firstLeg + secondLeg) / 2)
                * (Math.sqrt(Math.pow((double) thirdLeg, 2))
                - (Math.pow(((double) firstLeg - secondLeg) / 2, 2))));
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: IsoscelesTrapezoid, area: " + getArea()
                        + "sq.units, firstLeg: " + firstLeg
                        + " units, secondLeg: " + secondLeg
                        + " units, firstLeg: " + firstLeg
                        + " units, color: " + getColor()
        );
    }
}
