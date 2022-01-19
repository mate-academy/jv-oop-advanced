package core.basesyntax;

public class Circle extends Figure implements AreaCalculation {
    private double radius;

    Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculatinonArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: "
                + "radius = "
                + radius
                + ", color = " + getColor()
                + ", area = " + calculatinonArea();
    }
}

