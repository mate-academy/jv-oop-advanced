package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;

public class Square extends Figure {
    private final int side;
    private final int perimeter;

    public Square(Colors color, int side) {
        super(Figures.SQUARE, color);
        this.side = side;
        this.perimeter = side * 4;

        this.setArea(obtainArea());
    }

    @Override
    public float obtainArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", side: "
                + this.side
                + ", perimeter: "
                + this.perimeter);
    }

}
