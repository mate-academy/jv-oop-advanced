package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        super();
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * (radius * radius));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ");
        builder.append(getArea());
        builder.append(" sq.units, radius: ");
        builder.append(radius);
        builder.append(" units, color: ");
        builder.append(getColor().toLowerCase());
        System.out.println(builder);
    }
}
