package core.basesyntax;

public class Circle extends Figure {
    private double radius = 0;

    public Circle(String color, double radius) {
        super.setName("Circle");
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, radius : " + radius + " units, color : " + getColor());
    }
}
