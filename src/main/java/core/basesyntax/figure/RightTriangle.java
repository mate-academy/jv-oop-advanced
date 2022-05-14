package core.basesyntax.figure;

import java.util.Locale;

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
        System.out.println("Figure: right triangle, area:"
                + countArea() + "sq.units " + ", side "
                + getSide() + " baseSide " + getBaseSide()
                + ", color: " + getColor().toLowerCase(Locale.ROOT));
    }
}
