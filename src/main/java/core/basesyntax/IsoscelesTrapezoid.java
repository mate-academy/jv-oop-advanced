package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private int leftSide;
    private int rightSide;
    private int height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(String color, int leftSide, int rightSide, int height) {
        super(color);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.height = height;
    }

    public IsoscelesTrapezoid(String color) {
        super(color);
    }
}
