package core.basesyntax;

public class Rectangle extends Figure {
    int height;
    int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        super.color = color;
    }

    @Override
    public double ObtainArea() {
        return height * width;
    }

    @Override
    public void DrawArea() {
        System.out.println("Figure: rectangle, area: " + ObtainArea() + " sq. units, height: "
                + height + " units, width: " + width + " units, color: " + color);
    }
}
