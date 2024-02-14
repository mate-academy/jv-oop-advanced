package core.basesyntax.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class RightTriangle extends Figure {
    private int opposite;
    private int adjacent;

    public RightTriangle(Color color, int opposite, int adjacent) {
        super(color);
        this.adjacent = adjacent;
        this.opposite = opposite;
    }

    @Override
    public void draw() {
        System.out.println("Opposite: " + opposite
                + ", adjacent: " + adjacent);
        super.draw();
    }

    @Override
    public double getArea() {
        return 0.5 * opposite * adjacent;
    }
}
