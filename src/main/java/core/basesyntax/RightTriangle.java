package core.basesyntax;

class RightTriangle extends AbstractFigure {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle");
        System.out.println("First Leg: " + firstLeg);
        System.out.println("Second Leg: " + secondLeg);
        System.out.println("Color: " + color);
        System.out.println("Area: " + getArea());
    }

    @Override
    public String getColor() {
        return color;
    }
}
