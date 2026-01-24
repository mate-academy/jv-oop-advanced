package core.basesyntax;

public class Rectangle extends Figure{
    private String color;
    private int height;
    private int length;

    public Rectangle(String color, String color1, int height, int length) {
        super(color);
        this.color = color1;
        this.height = height;
        this.length = length;
    }
}
