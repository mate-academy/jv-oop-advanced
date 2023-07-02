package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int width;
    private int height;
    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
