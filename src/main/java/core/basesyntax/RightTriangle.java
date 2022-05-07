package core.basesyntax;

public class RightTriangle extends Figure {
    private final Round round = new Round();
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return round.toRound((double) (firstLeg * secondLeg) / 2);
    }

    public void toDraw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + getFirstLeg()
                + " units, second leg: " + getSecondLeg()
                + ", color: " + getColor());
    }
}
