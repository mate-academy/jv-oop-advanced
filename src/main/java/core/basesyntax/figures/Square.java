package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Figures;

public class Square extends Figure {
    private final int side;
    private final int perimeter;

    public Square(String color, int side) {
        super(Figures.SQUARE, color);
        this.side = side;
        this.perimeter = side * 4;

        this.setArea(getArea());
    }

    @Override
    public float getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println(this.getDrawingFirstPart()
                + ", side: "
                + this.side
                + " units, perimeter: "
                + this.perimeter
                + " units"

        );
    }
}
