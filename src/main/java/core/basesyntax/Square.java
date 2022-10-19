package core.basesyntax;

public class Square extends Figure implements Squarable {
    private final int a;

    public Square(String color, int a) {
        super(color);
        this.a = a;
    }

    @Override
    public double getSquare() {
        return Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return "square, area: " + getSquare() + " sq.units, side: " + a + " units, color: " + color.toLowerCase();
    }
}
