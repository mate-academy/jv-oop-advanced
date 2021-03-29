package core.basesyntax.figures;

import core.basesyntax.state.ColorSupplier;
import core.basesyntax.state.Figure;

public class Square extends Figure {
    private int side;

    public Square(String name) {
        this.name = name;
        color = ColorSupplier.getRandomColor();
        side = (int)((Math.random() * 10) + 1);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, side: %d cm, color: %s\n",
                name, area(), side, color);
    }
}
