package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getRadius()) * Math.PI;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure " + "circle " + "area: " + getArea()
                + " sq.units,  radius: " + getRadius() + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
