package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private int side;

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
