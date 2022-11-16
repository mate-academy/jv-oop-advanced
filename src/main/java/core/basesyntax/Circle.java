package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder("Figure: circle, area: ");
        info.append(getArea());
        info.append(" sq.units, radius: ");
        info.append(radius);
        info.append(" units, color: ");
        info.append(getColor().toLowerCase());
        System.out.println(info);
    }
}
