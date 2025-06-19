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
    public double obtainArea() {
        return height * width;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: rectangle, area: " + obtainArea() + " sq. units, height: "
                + height + " units, width: " + width + " units, color: " + color);
    }
}
