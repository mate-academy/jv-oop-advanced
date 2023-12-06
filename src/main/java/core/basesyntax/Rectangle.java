package core.basesyntax;

public class Rectangle extends Figure {
    private int base;
    private int height;

    public Rectangle(String color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;

    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Rectangle " + ", Color: " + color + ", area: " + getArea());
    }
}
