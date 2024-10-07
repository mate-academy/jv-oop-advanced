package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final FigureName figureName = FigureName.ISOSCELES_TRAPEZOID;
    private static final int DIVIDER = 2;
    private double height;
    private double firstSide;
    private double secondSide;

    public IsoscelesTrapezoid(String color, double height, double firstSide, double secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) * height / DIVIDER;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure:\t" + figureName
                + ",\tColor:\t" + this.getColor()
                + ",\tArea:\t" + this.getArea()
                + ",\tFirst Side:\t" + this.getFirstSide()
                + ",\tSecond Side:\t" + this.getSecondSide()
                + ",\tHeight:\t" + this.getHeight());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
