package core.basesyntax;

public class RightTriangle extends Figure {
    private static final FigureName figureName = FigureName.RIGHT_TRIANGLE;
    private static final int DIVIDER = 2;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / DIVIDER;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure:\t" + figureName
                + ",\tColor:\t" + this.getColor()
                + ",\tArea:\t" + this.getArea()
                + ",\tFirst Leg:\t" + this.getSecondLeg()
                + ",\tSecond Leg:\t" + this.getFirstLeg());
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }
}
