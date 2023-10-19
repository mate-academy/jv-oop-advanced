package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int length;

    public Rectangle(String type, String colour, String property, int height, int length) {
        super(type, colour, property);
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return height * length;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getType() + ", " + calculateArea() + " sq. units, height: "
                + height + " units, length: " + length + " units, color: "
                + getColour() + ", property: " + getProperty());
    }
}
