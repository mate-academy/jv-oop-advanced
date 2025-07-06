public class RightTriangle implements Figure {
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
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() +
                " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}

