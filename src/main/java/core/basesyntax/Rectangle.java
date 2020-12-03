package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        setSide1(side1);
        setSide2(side2);
        setColor();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return Math.round(side1 * side2);
    }

    public double getPerimetr() {
        return Math.round(2 * side1 + 2 * side2);
    }

    @Override
    public String draw() {
        return super.draw() + " rectangle,"
                + " area: " + getArea()
                + " color: " + getColor()
                + " side1: " + getSide1()
                + " side2: " + getSide2()
                + " perimetr: " + getPerimetr();
    }
}
