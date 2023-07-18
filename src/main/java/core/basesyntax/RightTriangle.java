package core.basesyntax;

public class RightTriangle extends AbstractAreaCalculator {
    private int firstLeg;

    private int secondLeg;

    private String color;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public String getColor() {
        return super.getColor();
    }

    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle - Color: " + color + ", First Leg: "
                + firstLeg + ", Second Leg: " + secondLeg + ", Area: " + getArea());
    }
}
