package core.basesyntax;

public class RightTriangle extends Figure {
    private int Side;


    public RightTriangle(String color, int Side) {
        super(color);
        this.Side = Side;
    }

    public int getSide() {
        return Side;
    }

    public void setSide(int firstLeg) {
        this.Side = Side;
    }

    @Override
    public double calculateArea() {
        return (Side * 3);
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "rightTriangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "Side: " + Side + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
