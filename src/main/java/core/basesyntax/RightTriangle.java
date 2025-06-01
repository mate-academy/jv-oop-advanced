package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private String color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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
                + " color: " + getColor());

    }
}

