package core.basesyntax;
import java.util.Locale;
class Square extends Figure {
    private final double side;
    public Square(double side, String color) {
        super(color);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public void draw() {
        System.out.println(String.format(Locale.US,
                "Figure: square, area: %.2f sq. units, side: %.1f units, color: %s",
                getArea(), side, getColor()));
    }
}
