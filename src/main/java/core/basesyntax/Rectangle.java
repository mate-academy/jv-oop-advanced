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
        System.out.println(START_MASSAGE + this + ", area: " + this.getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "rectangle, "
                + "its color: " + color
                + ", with sides: " + width + " units, " + height + " units";
    }
}
