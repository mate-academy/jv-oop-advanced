package core.basesyntax;

import java.awt.Color;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorGenerator = new ColorSupplier();
    private final Random randomIntGenerator = new Random();
    private final int intCount = 20;

    public Color getColorGen() {
        return colorGenerator.getRandomColor();
    }

    public int getRandomIntGen() {
        return randomIntGenerator.nextInt(intCount);
    }

    public Figure getRandomFigure() {
        int figureNumber = randomIntGenerator.nextInt(FigureTypes.values().length);
        switch (figureNumber) {
            case 0:
                return new Square(getRandomIntGen(), getColorGen(), FigureTypes.SQUARE);
            case 1:
                return new IsoscelesTrapezoid(getRandomIntGen(), getRandomIntGen(),
                        getRandomIntGen(), getColorGen(), FigureTypes.ISOSCELESTRAPEZOID);
            case 2:
                return new Rectangle(getRandomIntGen(), getRandomIntGen(), getColorGen(),
                        FigureTypes.RECTANGLE);
            case 3:
                return new RightTriangle(getRandomIntGen(), getRandomIntGen(), getColorGen(),
                        FigureTypes.RIGHTTRIANGLE);
            case 4:
            default:
                return new Circle(getRandomIntGen(), getColorGen(), FigureTypes.CIRCLE);
        }
    }
}

