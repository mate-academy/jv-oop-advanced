package core.basesyntax;

public class Circle extends Figure implements Area {
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + color);
    }
}
