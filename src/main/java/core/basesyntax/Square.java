package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color, String property) {
        super(color, property);
        this.side = side;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        return (Math.pow(side, 2));
    }

    @Override
    public String draw() {
        return "Figure{Square , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + getProperty() + ": " + side
                + " units, color: " + getColor()
                + '}';
    }
}
