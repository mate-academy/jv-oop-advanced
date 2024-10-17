package core.basesyntax;

public class RightTriangle extends Default {
    private double size;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double size, double firstLeg, double secondLeg) {
        super(color);
        this.size = size;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {

        return size * size;
    }

    @Override
    public double getProperty() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle: area: " + Math.round(getArea())
                + ", Property: " + Math.round(getProperty())
                + ", Color: " + getColor()
                + ", firstLeg: " + Math.round(firstLeg)
                + ", secondLeg: " + Math.round(secondLeg));
    }
}
