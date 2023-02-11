package core.basesyntax.supplier;

import core.basesyntax.color.Color;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURE = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private RandomSupplier randomSupplier = new RandomSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int figureNumber = random.nextInt(NUMBER_OF_FIGURE);
        switch (FigureName.values()[figureNumber]) {
            case CIRCLE:
                figure = new Circle(colorSupplier.getRandomColor(), randomSupplier.getRandomValue());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomSupplier.getRandomValue(), randomSupplier.getRandomValue(), randomSupplier.getRandomValue());
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(), randomSupplier.getRandomValue(), randomSupplier.getRandomValue());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(), randomSupplier.getRandomValue(), randomSupplier.getRandomValue());
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(), randomSupplier.getRandomValue());
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
