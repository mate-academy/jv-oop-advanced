package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = (int) firstLeg;
        this.secondLeg = (int) secondLeg;
    }
    
    @Override
    public Double getArea() {
        return (getFirstLeg() * getSecondLeg()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, firstLeg: "
                + getFirstLeg() + ", secondLeg: " + getSecondLeg() + " units, color: " + color);

    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
