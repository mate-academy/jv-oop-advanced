package core.basesyntax.model;

public class Rectangle extends Figure {
    private int longSide;
    private int shortSide;

    public Rectangle(String color, int longSide, int shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", rectangle: " + getArea() + "sq. units, color: " + getColor() + ", side a: "
                + shortSide + ", side b: " + longSide);
    }
}
