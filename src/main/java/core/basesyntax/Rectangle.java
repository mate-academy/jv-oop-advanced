package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double areaOfFigure() {
        return sideA * sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure-> " + getClass().getSimpleName()
                            + "\nArea of figure-> " + areaOfFigure()
                            + "\nColor-> " + getColor()
                            + "\nSide A-> " + getSideA()
                            + "\nSide B-> " + getSideB());
    }
}
