package core.basesyntax;

public class Square extends Figure{
    private String color;
    private int leg;

    public Square(String color, String color1, int leg) {
        super(color);
        this.color = color1;
        this.leg = leg;
    }
}
