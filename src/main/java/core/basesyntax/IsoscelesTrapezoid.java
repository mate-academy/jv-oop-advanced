package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int side1;
    private int side2;
    private int height;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, " + " area: " + getArea()
                + " sq.units, " + " side1: " + getSide1() + ", " + " side2: "
                + getSide2() + ", " + " height: " + getHeight() + " units, "
                + " color; " + color);
    }

    @Override
    public double getArea() {
        return ((side1 + side2) / 2) * height;
    }
}
