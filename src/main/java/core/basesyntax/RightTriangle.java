package core.basesyntax;

public class RightTriangle extends Figures {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg= firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (getSideA() * sideB) / 2;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName() + ", area " + getArea()
                + "sq.units, firstLeg: " + getSideA() + "units" + "secondLeg: "
                + sideB + "units, " + "color: " + getColor());
    }
}
