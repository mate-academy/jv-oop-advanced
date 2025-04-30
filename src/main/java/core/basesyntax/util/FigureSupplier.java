package core.basesyntax.util;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier randomColor = new ColorSupplier();
    private Random randomSide = new Random();
    private Color defaultColor = Color.WHITE;
    private int defaultRadius = 10;
    private int maxValue = 10;
    private int min = 1;
    private int max = 5;

    public Figure getRandomFigure() {
        int randomSelecter = (int)(Math.random() * max) + min;
        switch (randomSelecter) {
            case 1:
                return new Circle(randomColor.getRandomColor(), randomSide.nextInt(maxValue));
            case 2:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        randomSide.nextInt(maxValue), randomSide.nextInt(maxValue),
                        randomSide.nextInt(maxValue));
            case 3:
                return new Rectangle(randomColor.getRandomColor(),
                        randomSide.nextInt(maxValue), randomSide.nextInt(maxValue));
            case 4:
                return new RightTriangle(randomColor.getRandomColor(),
                        randomSide.nextInt(maxValue), randomSide.nextInt(maxValue));
            case 5:
                return new Square(randomColor.getRandomColor(), randomSide.nextInt(maxValue));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);

    }

}
