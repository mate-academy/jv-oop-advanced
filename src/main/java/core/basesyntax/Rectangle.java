package core.basesyntax;

public class Rectangle extends Figure {
    private int shortSide;
    private int longSide;

    public Rectangle(String name, String color, int shortSide, int longSide) {
        super(name, color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    @Override
    public void drawInfo() {
        super.drawInfo();
        System.out.print(getName() + ", area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, shortSide: " + shortSide
                + " units, longSide: " + longSide + " units, color: " + getColor());
    }
}
