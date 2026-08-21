package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private int firstBase;
    private int secondBase;
    private int height;

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return (double) (firstBase + secondBase) / 2 * height;
    }
}
