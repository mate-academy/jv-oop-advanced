package core.basesyntax;

import java.util.Locale;

public class Square extends Figure{
    private final int squareSide;

    public Square(String color, int squareSide) {
        super(color);
        this.squareSide = squareSide;
        this.figureType = FigureType.SQUARE.toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.0f sq.units, squareSide: %d units, color: %s%n",
                figureType,
                getArea(),
                squareSide,
                color);
    }
}
