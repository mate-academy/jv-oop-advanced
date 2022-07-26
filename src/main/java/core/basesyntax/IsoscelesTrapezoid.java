package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public int getBaseA() {
        return baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double areaOfFigure() {
        return (double) ((baseA + baseB) / 2) * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure-> " + getClass().getSimpleName()
                            + "\nArea of figure-> " + areaOfFigure()
                            + "\nColor-> " + getColor()
                            + "\nBase A-> " + getBaseA()
                            + "\nBase B-> " + getBaseB()
                            + "\nHeight-> " + getHeight());
    }
}
