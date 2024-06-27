package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Describer;

public class Square extends Figure {
    private static final String type = "square";
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public String getInfo() {
        return "Figure: "
                + type + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "side: "
                + side
                + " units, "
                + "color: "
                + color;
    }
}
