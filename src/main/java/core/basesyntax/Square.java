package core.basesyntax;

public class Square extends Figure implements Area {
    private double leg;

    public Square(double leg, String color) {
        this.leg = leg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                +
                getArea()
                +
                " sq.units, leg: "
                +
                leg
                +
                " units, color: "
                +
                getColor());
    }
}
