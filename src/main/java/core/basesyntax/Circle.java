package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    public int figureArea() {
        return (int) Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public void drawFigure() {
        System.out.println("Figure: Circle, " + " radius: " + radius + ", color " + color
                            + ", Circle Area " + figureArea());
    }
}
