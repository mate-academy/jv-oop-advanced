package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, Calculateble {
    private int high;
    private int middleLine;

    public IsoscelesTrapezoid(Color color, int high, int middleLine) {
        super(color);
        this.high = high;
        this.middleLine = middleLine;
    }

    @Override
    public double getSquare() {
        return high * middleLine;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
