package core.basesyntax;

public class Rectangle extends Figure {
    private static final FigureName figureName = FigureName.RECTANGLE;
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure:\t" + figureName
                + ",\tColor:\t" + this.getColor()
                + ",\tArea:\t" + this.getArea()
                + ",\tFirst Side:\t" + this.getFirstSide()
                + ",\tSecond Side:\t" + this.getSecondSide());
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
