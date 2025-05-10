package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String id, String color) {
        super(id, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String drawFigure() {
        return "Figure:" + getId()
                + ", Area " + calculateArea()
                + " sq, "
                + "height: " + height
                + ", color " + getColor();

    }

    @Override
    public double calculateArea() {
        return (sideA + sideB) * height / 2;
    }
}
