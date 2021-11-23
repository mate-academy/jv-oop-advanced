package core.basesyntax;

public class Square extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Square(Color color, int firstLeg, int secondLeg) {
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
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
