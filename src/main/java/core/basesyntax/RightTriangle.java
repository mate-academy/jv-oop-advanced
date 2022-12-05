package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
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
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle"
                + ", area=" + this.getArea()
                + " sq.units"
                + "firstLeg=" + firstLeg
                + " units"
                + ", secondLeg=" + secondLeg
                + " units"
                + ", color=" + getColor());
    }
}
