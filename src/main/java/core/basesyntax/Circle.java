package core.basesyntax;

public class Circle extends Figure {
    private double area;
    private int radius;

    public Circle() {
        super();
    }

    public Circle(String color, double area, int radius) {
        super(color);
        this.area = area;
        this.radius = radius;
    }

    /*public double getArea() {
    //    return area;
    }*/

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
        setArea(Math.PI * (radius * radius));
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
