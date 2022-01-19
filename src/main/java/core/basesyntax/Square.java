package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(side, 2));
    }

    @Override
    public String draw() {
        return "Figure{Square , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + "side: " + side
                + " units, color: " + getColor()
                + '}';
    }
}
