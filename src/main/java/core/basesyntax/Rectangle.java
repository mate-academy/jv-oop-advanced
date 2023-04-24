package core.basesyntax;

public class Rectangle extends Figure {
    public static final int MAX_FIRST_SIDE = 30;
    public static final int MAX_SECOND_SIDE = 30;
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void printFigureInfo() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, firstSide: " + getFirstSide()
                + " units, secondSide: " + getSecondSide()
                + " units, color: " + getColor());
    }
}
