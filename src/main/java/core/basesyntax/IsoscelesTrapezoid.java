package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int base1,
                              int base2, int height) {
        setName(name);
        setColor(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2.0;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", Area: " + getArea()
                + " sq. units, base 1: " + getBase1() + " units, base 2: "
                + getBase2() + " units, height: " + getHeight() + " units, color: "
                + getColor());
    }
}
