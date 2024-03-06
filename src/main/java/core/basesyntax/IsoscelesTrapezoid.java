package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(Colors color, int upperSide, int downSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperSide + downSide) * height) / 2;
    }

}
