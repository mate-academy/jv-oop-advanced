package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        setRadius(radius);
        setColor(color);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public String draw() {
        return "circle, radius: " + getRadius() + " units, color: "
                + getColor() + ", area: " + area() + " sq.";
    }
}
