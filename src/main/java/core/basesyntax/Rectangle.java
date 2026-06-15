package core.basesyntax;

public class Rectangle extends Figure{
    private Double width;
    private Double length;

    public Rectangle(String color, Double width, Double length) {
        super(color);
        this.width = width;
        this.length = length;
    }
}
