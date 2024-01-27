package core.basesyntax;

public class Rectangle extends Figure {
    private final double longSide;
    private final double shortSide;

    public Rectangle(String color, double longSide, double shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public double getLongSide() {
        return longSide;
    }

    public double getShortSide() {
        return shortSide;
    }

    @Override
    public double getArea() {
        return getShortSide() * getLongSide();
    }

    @Override
    public void draw() {
        System.out.println("This is " + super.getColor().toLowerCase() + " rectangle "
                + "with sides of " + longSide + "*" + shortSide
                + " and area of " + getArea());
    }
}
