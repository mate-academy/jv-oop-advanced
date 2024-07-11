package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int base;

    public RightTriangle(int side, int base, String color) {
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
        System.out.println("Drawing a " + getColor() + " right trianangle, with "
                + getSide() + " units site and " + getBase() + " units base");
    }

    @Override
    public double getArea() {
        return (side * base) / 2;
    }

    @Override
    public void getFigureData() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq. units, side: " + getSide()
                + " units, base: " + getBase()
                + " units, color: " + getColor());
    }
}
