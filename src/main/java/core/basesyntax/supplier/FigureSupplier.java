package core.basesyntax.supplier;

import core.basesyntax.color.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureName;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private RandomSupplier randomSupplier = new RandomSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int figureNumber = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[figureNumber]) {
            case CIRCLE:
                figure = new Circle(colorSupplier.getRandomColor(),
                        randomSupplier.getRandomValue());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomSupplier.getRandomValue(),
                        randomSupplier.getRandomValue(),
                        randomSupplier.getRandomValue());
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        randomSupplier.getRandomValue(),
                        randomSupplier.getRandomValue());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        randomSupplier.getRandomValue(),
                        randomSupplier.getRandomValue());
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(),
                        randomSupplier.getRandomValue());
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
