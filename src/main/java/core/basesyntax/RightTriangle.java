package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double area = firstLeg * secondLeg;
        return area / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor());
    }
}
