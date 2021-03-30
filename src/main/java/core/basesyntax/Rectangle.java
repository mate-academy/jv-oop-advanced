package core.basesyntax;

public class Rectangle extends Figure {
    private int height;

    public Rectangle(String color, int height, int width) {
        super("rectangle", color, new Property("width length", width));
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * getProperty().getValue();
    }
}
