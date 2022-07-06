package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawInfo() {
        super.drawInfo();
        System.out.print("circle" + ", area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
