package core.basesyntax;

public class Circle extends Figure {
    private Double area;
    private int radius;
    private static final Double PI_CONST = 3.14;

    public Circle() {
        super();
    }

    public Circle(String color, Double area, int radius) {
        super(color);
        this.area = area;
        this.radius = radius;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        setArea(PI_CONST * 2 * radius);
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ");
        builder.append(area);
        builder.append(" sq.units, radius: ");
        builder.append(radius);
        builder.append(" units, color: ");
        builder.append(super.getColor().toLowerCase());
        System.out.println(builder);
    }
}
