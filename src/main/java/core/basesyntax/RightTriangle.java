package core.basesyntax;

public class RightTriangle implements Figure {
    private String color;
    private double firstLeg;
    private double secondLeg;

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
        System.out.println("Drawable: rightTriangle, area: " + getArea()
                + " firstLeg: " + firstLeg
                + " secondLeg: " + secondLeg
                + " color: " + color);

    }
}

