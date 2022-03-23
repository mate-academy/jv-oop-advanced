package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private final int baseSide;
    private final int side;

    public RightTriangle(String color, int baseSide, int side) {
        super(color);
        this.baseSide = baseSide;
        this.side = side;
    }

    public int getBaseSide() {
        return baseSide;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double countArea() {
        return baseSide * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", right triangle: "
                + countArea() + "sq. units, color " + getColor() + ", side "
                + getSide() + " baseSide " + getBaseSide());
    }
}
