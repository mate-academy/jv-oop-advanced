package core.basesyntax;

public class Rectangle extends Figure {

    private String color;
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        this.color = color;
        if (width <= 0 || height <= 0) {
            System.out.println("Some of parameters is less than one");
            return;
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "rectangle, "
                + "area: " + getArea() + " sq. units, "
                + "big base: " + width + " units, "
                + "height: " + height + " units, "
                + "color: " + color;
    }
}
