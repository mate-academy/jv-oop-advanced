package core.basesyntax;

public class Circle extends Figure implements AreaCalculation {
    private double radius;
    private String color;
    private double area;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area = calculatinonArea();
    }

    @Override
    public double calculatinonArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius +
                ", color = " + color +
                ", area = " + area;
    }
}

