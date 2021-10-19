package core.basesyntax;

public class Circle {
    private int radius;

    public Circle(int radius, String color) {
        double area = Math.PI * radius * radius;
        Draw draw = new Draw();
        draw.draw("circle", area, "radius: " + radius, color);
    }
}
