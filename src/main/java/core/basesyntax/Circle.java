package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        super.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getName().substring(16)
                + ", area: " + String.format("%.3f", getArea()) + " sqr. units, radius: "
                + getRadius() + " units , color: "
                + getColor().toString().toLowerCase());
    }
}
