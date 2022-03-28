package core.basesyntax.model;

public class Circle extends Figure implements FigureArea {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public void area() {
        double areaCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Figure: circle, area: " + areaCircle +
                " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
