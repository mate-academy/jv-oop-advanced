package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: "
                + "rectangle, "
                + "area: " + getArea()
                + ", width: " + this.width
                + ", height: " + this.height
                + ", color: " + this.color
        );
    }

    public int getArea() {
        return this.width * this.height;
    }
}
