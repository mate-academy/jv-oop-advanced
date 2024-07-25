package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int base;

    public Rectangle(String color, int side, int base) {
        super(color);
        this.side = side;
        this.base = base;
    }

    @Override
    public double getArea() {
        double rectangleArea = side * base;
        return getFormat("#.##", rectangleArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + FigureName.RECTANGLE.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, color: " + getColor().toLowerCase());
    }
}
