package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String type, String colour, String property, int side) {
        super(type, colour, property);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getType() + ", " + calculateArea() + " sq. units, side: "
                + side + " units, color: " + getColour() + ", property: " + getProperty());
    }
}
