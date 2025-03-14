package core.basesyntax;

public class Circle extends Figure implements Area, Draw {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double printArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: circle, area " + printArea();
        String secondPart = " sq. units, radius: " + radius + " units, color: " + getColor();
        System.out.println(firstPart + secondPart);
    }
}
