package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private int height;
    private int length;

    public Rectangle(String type, String colour, String property, int height, int length) {
        super(type, colour, property);
        this.height = height;
        this.length = length;
    }

    @Override
    public double calcArea() {
        return height * length;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getType() + ", " + calcArea() + " sq. units, height: "
                + height + " units, length: " + length + " units, color: "
                + getColour() + ", property: " + getProperty());
    }
}
