package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setArea();
    }

    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void getFigure() {
        System.out.println("---------------------------------");
        System.out.println("name: " + getName());
        System.out.println("color: " + getColor());
        System.out.println("area: " + getArea());
        System.out.println("firsLeg: " + firstLeg);
        System.out.println("secondLeg: " + secondLeg);
    }
}
