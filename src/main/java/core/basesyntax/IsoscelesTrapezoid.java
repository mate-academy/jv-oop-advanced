package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private String color;
    private int height;

    public IsoscelesTrapezoid(String color, String color1, int height) {
        super(color);
        this.color = color1;
        this.height = height;
    }
}
