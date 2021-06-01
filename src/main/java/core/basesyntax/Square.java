package core.basesyntax;

public class Square extends Figure implements Drawable {
    double side;
    @Override
    public double calculateArea() {
        return side * side;
    }
}
