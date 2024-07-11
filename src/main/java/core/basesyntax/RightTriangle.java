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
        System.out.println("Drawing a righttrianangle");
    }

    @Override
    public double getArea() {
        return (side * base) / 2;
    }

    @Override
    public String getFigureData() {
        return "Figure: triangle, area: " + getArea()
                + " sq. units, side: " + getSide()
                + " sq. units, base: " + getBase()
                + " units, color: " + getColor();
    }
}
