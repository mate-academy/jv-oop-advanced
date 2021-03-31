package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color, "circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getArea() {
        return (int) Math.PI * (this.radius * this.radius);
    }

    @Override
    public String drawArea() {
        return super.drawArea() + ", radius : " + getRadius() + " units";
    }
}
