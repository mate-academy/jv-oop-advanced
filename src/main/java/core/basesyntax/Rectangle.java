package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int base;

    public Rectangle(int side, int base, String color) {
        this.side = side;
        this.base = base;
        this.setColor(color);
    }

    public int getSide() {
        return side;
    }

    public int getBase() {
        return base;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor()
                + " rectangle, with " + getSide() + " units side");
    }

    @Override
    public double getArea() {
        return side * base;
    }

    @Override
    public void getFigureData() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, side: " + getSide()
                + " units, base: " + getBase()
                + " units, color: " + getColor());
    }
}
