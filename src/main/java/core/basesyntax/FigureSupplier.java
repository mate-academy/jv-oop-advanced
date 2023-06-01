package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    protected Figure getRandomFigure() {
        int index = new Random().nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        Color randomColor = new ColorSupplier().getRandomColor();

        if (figureType == FigureType.SQUARE) {
            return new Square(getRandomInt(), randomColor);
        } else if (figureType == FigureType.RECTANGLE) {
            return new Rectangle(getRandomInt(), getRandomInt(), randomColor);
        } else if (figureType == FigureType.RIGHTTRIANGLE) {
            return new RightTriangle(getRandomInt(), getRandomInt(), randomColor);
        } else if (figureType == FigureType.CIRCLE) {
            return new Square(getRandomInt(), randomColor);
        } else if (figureType == FigureType.ISOSCELESTRAPEZOID) {
            return new IsoscelesTrapezoid(getRandomInt(), getRandomInt(), getRandomInt(),
                    randomColor);
        } else {
            return getDefaultFigure();
        }
    }

    private int getRandomInt() {
        final int maxval = 1000;
        return new Random().nextInt(maxval) + 1;
    }

    public Figure getDefaultFigure() {
        final int radius = 10;
        final Color color = Color.WHITE;
        return new Circle(radius, color);
    }
}
