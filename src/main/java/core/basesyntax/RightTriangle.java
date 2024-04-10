package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle(String color, int height, int base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (double) (height * base) / 2;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle = {" + "color: " + getColor()
                + ", firstLeg: " + getHeight()
                + ", secondLeg: " + getBase() + ", area: " + getArea() + "}");
    }
}
