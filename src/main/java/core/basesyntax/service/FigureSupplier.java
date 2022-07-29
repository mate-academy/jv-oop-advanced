package core.basesyntax.service;

import static core.basesyntax.Main.MAXIMUM_LENGTH;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureType;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure = null;
        int numberFigureTypes = FigureType.values().length;
        int randomFigureTypeIndex = random.nextInt(numberFigureTypes);
        FigureType randomFigureType = FigureType.values()[randomFigureTypeIndex];
        Color randomColor = colorSupplier.getRandomColor();
        switch (randomFigureType) {
            case CIRCLE:
                figure = new Circle(randomColor,
                        random.nextInt(MAXIMUM_LENGTH));
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(randomColor,
                        random.nextInt(MAXIMUM_LENGTH),
                        random.nextInt(MAXIMUM_LENGTH),
                        random.nextInt(MAXIMUM_LENGTH));
                break;
            case RECTANGLE:
                figure = new Rectangle(randomColor,
                        random.nextInt(MAXIMUM_LENGTH),
                        random.nextInt(MAXIMUM_LENGTH));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(randomColor,
                        random.nextInt(MAXIMUM_LENGTH),
                        random.nextInt(MAXIMUM_LENGTH));
                break;
            default:
                figure = new Square(randomColor,
                        random.nextInt(MAXIMUM_LENGTH));
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
