package core.basesyntax;

public class RightTriangle extends Figures {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName() + " is " + getColor().toLowerCase()
                + " and has area: " + getArea() + " sq. units, because has sides: "
                + getFirstLeg() + ", " + getSecondLeg());
    }
}
