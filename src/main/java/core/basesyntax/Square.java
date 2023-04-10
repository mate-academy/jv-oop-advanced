package core.basesyntax;

public class Square extends Figure {

    private double leg;

    private String color;

    public Square(String color, double leg) {
        super(color);
        this.leg = leg;
    }

    public double getLeg() {
        return leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, leg: "
                + leg + " units, color: " + getColor());
    }
}
