package core.basesyntax;

public class Rectangle extends Figure {

    private int base;
    private int height;

    public Rectangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return this.base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return this.base * this.height;
    }

    @Override
    public void draw() {
        System.out.println("rectangle, area: " + this.getArea() + " sq. units, base: "
                + this.base + ", height: " + this.height + " , color: " + this.getColor());
    }
}
