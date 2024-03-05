package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private int upperSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upperSide, int downSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public int getArea() {
        return 0;
    }
    @Override
    public String draw() {
        return null;
    }
}
