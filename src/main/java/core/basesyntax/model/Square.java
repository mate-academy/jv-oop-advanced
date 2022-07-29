package core.basesyntax.model;

public class Square extends Figure {
    private int leg;

    public Square() {
    }

    public Square(Color color) {
        super(color);
    }

    public Square(Color color, int leg) {
        this(color);
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public double calculateArea() {
        return leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + calculateArea() + " sq.units, leg = "
                + getLeg() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
