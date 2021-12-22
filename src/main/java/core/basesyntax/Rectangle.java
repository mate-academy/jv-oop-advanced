package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private int width;
    private int height;
    private String colour;

    public Rectangle(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.setColour(colour);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + getArea() + " sq.units, "
                + "width: " + width + " units, " + "height: " + height + " units, "
                + "color: " + getColour());
    }

}
