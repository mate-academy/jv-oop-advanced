package core.basesyntax.figure;

import java.util.Locale;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideB, int sideA) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double countArea() {
        return sideB * sideA;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: "
                + countArea() + " sq.units"
                + ", SideA " + getSideA() + " SideB " + getSideB()
                + ", color: " + getColor().toLowerCase(Locale.ROOT));
    }
}
