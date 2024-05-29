package core.basesyntax.figures;

import core.basesyntax.Color;

public class Square extends Figure {
    private static final String OUTPUT_SQUARE = "Figure: square, "
            + "area: %.2f sq. units, "
            + "side: %.2f units, "
            + "color: %s";
    private double side;

    public Square() {

    }

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        this.area = side * side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println(String.format(OUTPUT_SQUARE,
                this.area,
                this.side,
                this.color
        ));
    }
}
