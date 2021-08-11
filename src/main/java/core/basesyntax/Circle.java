package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius > 0 ? radius : 0;
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append(" Figure: circle, area: ")
                .append(this.getArea()).append(" sq.units, radius: ")
                .append(this.getRadius()).append(" units, color: ")
                .append(this.getColor()).toString());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
