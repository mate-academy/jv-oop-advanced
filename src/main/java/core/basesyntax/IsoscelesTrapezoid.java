package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        setColor(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (getBase1() + getBase2()) / 2 * getHeight();
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " base1: " + getBase1()
                + " base2: " + getBase2()
                + " height: " + getHeight()
                + " color: " + getColor();
    }
}
