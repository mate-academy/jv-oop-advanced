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
        System.out.println("Drawing a rectangle");
    }

    @Override
    public double getArea() {
        return side * base;
    }

    @Override
    public String getFigureData() {
        return "Figure: rectangle, area: " + getArea()
                + " sq. units, side: " + getSide()
                + " sq. units, base: " + getBase()
                + " units, color: " + getColor();
    }
}
