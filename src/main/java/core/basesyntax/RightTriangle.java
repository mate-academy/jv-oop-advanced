package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, String name, double firstLeg, double secondLeg) {
        this.setColor(color);
        this.setName(name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, leg: " + firstLeg + " units, height: " + secondLeg
                + " units, color: " + getColor());
    }
}
