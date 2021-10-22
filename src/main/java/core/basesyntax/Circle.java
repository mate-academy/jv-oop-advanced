package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * radius * radius * 100) / 100;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, radius: "
                + radius + " units, color " + getColor());
    }
}
