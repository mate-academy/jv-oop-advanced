package core.basesyntax;

public class Circle extends Figure implements Drawable, AreaCalculable {
    private double radius;

    public Circle(double radius, String color) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area:" + area() + "sq. units, radius: "
                + radius + " color: " + getColor());
    }
}
