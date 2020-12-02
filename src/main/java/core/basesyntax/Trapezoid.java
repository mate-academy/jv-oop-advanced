package core.basesyntax;

public class Trapezoid extends Figure implements GeometricObject {
    private int firstBase;
    private int secondBase;
    private int height;

    public void trapezoid(int firstBase, int secondBase, int height) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public int getHeight() {
        return height;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {

        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public Color getColor() {

        return ColorProducer.getColor();
    }

    @Override
    public String displayInfo() {

        return "Figure:Trapezoid" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Height:" + height;
    }
}
