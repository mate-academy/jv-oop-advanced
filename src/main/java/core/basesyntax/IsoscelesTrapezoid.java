package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements ForFigure {
    private int baseSide1;
    private int baseSide2;
    private int height;

    public int getBaseSide1() {
        return baseSide1;
    }

    public void setBaseSide1(int baseSide1) {
        this.baseSide1 = baseSide1;
    }

    public int getBaseSide2() {
        return baseSide2;
    }

    public void setBaseSide2(int baseSide2) {
        this.baseSide2 = baseSide2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (baseSide1 + baseSide2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + area()
                + "sq. units, base side 1: "
                + baseSide1 + " units, base side 2: " + baseSide2 + "units, height: "
                + height + " units, color: " + getColor());
    }
}
