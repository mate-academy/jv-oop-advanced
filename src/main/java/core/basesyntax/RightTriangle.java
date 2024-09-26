package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, double area, double firstLeg,
                         double secondLeg, String color) {
        super(name, area, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String name, double area, String color) {
        super(name, area, color);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + ", " + "firstLeg: "
                + getFirstLeg() + ", " + "secondLeg: "
                + getSecondLeg() + ", " + "color: " + getColor());
    }
}
