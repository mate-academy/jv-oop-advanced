package core.basesyntax;

public class Rectangle extends Figures {
    private int longSide;
    private int shortSide;

    public Rectangle(int longSide, int shortSide, String color) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, long side: " + longSide
                + " units, short side: " + shortSide
                + " units, color: " + getColor());
    }
}
