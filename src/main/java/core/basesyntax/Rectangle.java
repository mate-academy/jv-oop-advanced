package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String name, String color, int height, int side) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.width = side;
    }

    @Override
    public int area() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", color: " + color
                + ", area: " + area() + " sq.units"
                + ", height: " + height + " units"
                + ", width: " + width + " units"
                + ";"
        );
    }
}
