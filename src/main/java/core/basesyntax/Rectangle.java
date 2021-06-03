package core.basesyntax;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(String color, float width, float height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, width: " + width + " units, height: "
                + height + " units, color: " + getColor());
    }
}
