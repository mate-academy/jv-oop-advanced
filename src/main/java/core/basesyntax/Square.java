package core.basesyntax;

public class Square extends Figure{

    private double leg;

    public Square(Color color, double leg) {
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
}
