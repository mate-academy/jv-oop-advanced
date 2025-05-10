package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        double area = this.calculateArea();
        String colorLowerCase = this.getColor().name().toLowerCase();
        String information = String.format(
                "Figure: square, area: %.1f sq.units, side: %d units, color: %s",
                area, side, colorLowerCase);
        System.out.println(information);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
