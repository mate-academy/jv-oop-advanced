package core.basesyntax;

public class Square extends Figure implements Squarable{
    private final int a;
    public Square(String color, int a) {
        super(color);
        this.a = a;
    }

    @Override
    public double getSquare() {
        return Math.pow(a, 2);
    }
}
