package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.setColor(color);
        setArea(calculateArea());
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public Circle() {}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units,  radius: "+ radius + " units, color: " + getColor());
    }
}
