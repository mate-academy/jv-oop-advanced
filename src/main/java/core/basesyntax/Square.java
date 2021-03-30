package core.basesyntax;

public class Square extends Figure {

    public Square(String color, double side) {
        super("square", color, new Property("side", side));
    }

    @Override
    public double calculateArea() {
        return getProperty().getValue() * getProperty().getValue();
    }
}
