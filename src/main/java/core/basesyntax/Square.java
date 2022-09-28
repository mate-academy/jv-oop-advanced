package core.basesyntax;

public class Square extends Figure {
    private int Side;

    public Square(String color, int Side) {
        super(color);
        this.Side = Side;
    }

    public int getFirstLeg() {
        return Side;
    }

    public void setFirstLeg(int firstLeg) {
        this.Side = firstLeg;
    }

    @Override
    public double calculateArea() {
        return Side * Side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "square, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + Side + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
