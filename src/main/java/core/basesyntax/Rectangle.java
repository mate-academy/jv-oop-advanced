package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder("Figure: rectangle, area: ");
        info.append(getArea());
        info.append(" sq.units, length: ");
        info.append(length);
        info.append(" units, width: ");
        info.append(width);
        info.append(" units, color: ");
        info.append(getColor().toLowerCase());
        System.out.println(info);
    }
}
