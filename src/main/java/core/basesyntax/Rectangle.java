package core.basesyntax;

public class Rectangle extends Figure {
    private int shortSide;
    private int longSide;

    public Rectangle(String color, int shortSide, int longSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has a long side: " + longSide + ", short side: "
                + shortSide + " and has an area: " + getArea());
    }
}
