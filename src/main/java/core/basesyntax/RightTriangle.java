package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: "
                + calculateArea() + "; " + "Leg: "
                + firstLeg + "; " + "Leg: "
                + secondLeg + "; " + "Color: "
                + getColor() + ";");
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
