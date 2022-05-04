package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        setColor(color);
    }

    @Override
    public double getArea() {
        return height * width; 
    }

    @Override
    public String draw() {
        return "rectangle, area: " + getArea()
            + " sq.units, height: " + height + " units, width: "
            + width + " units, color: " + getColor().toLowerCase();
    }
}
