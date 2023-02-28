package core.basesyntax;

public class RightTriangle implements Figure {

    private double catet1;
    private double catet2;
    private Color color;

    public String figureInfo() {
        return "Figure : Right Triangle, Area :" + getArea() + " Catet1: " + catet1 + " Catet2: " + catet2 + " Color: " + color;
    }

    public RightTriangle(int catet1, int catet2, Color color) {
        this.catet1 = catet1;
        this.catet2 = catet2;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (catet1 * catet2) / 2;
    }
}
