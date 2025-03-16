package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public void drawArea() {
        System.out.println( Math.PI * radius * radius);
    }
}
