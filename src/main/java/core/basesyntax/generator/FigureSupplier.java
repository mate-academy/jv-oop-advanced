package core.basesyntax.generator;

import core.basesyntax.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int UPPER_BOTTOM = 16;

    public Figure[] generateFigures(int figuresCount) {
        Figure[] figures = new Figure[figuresCount];
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        for (int i = 0; i < figuresCount; i++) {
            int figureNumber = random.nextInt(NUMBER_OF_FIGURES);
            switch (figureNumber) {
                case 0:
                    figures[i] = new Circle(random.nextInt(UPPER_BOTTOM), "circle",
                            colorSupplier.getRandomColor());
                    break;
                case 1:
                    figures[i] = new IsoscelesTrapezoid(random.nextInt(UPPER_BOTTOM),
                            random.nextInt(UPPER_BOTTOM),
                            random.nextInt(UPPER_BOTTOM), "isosceles trapezoid",
                            colorSupplier.getRandomColor());
                    break;
                case 2:
                    figures[i] = new Rectangle(random.nextInt(UPPER_BOTTOM),
                            random.nextInt(UPPER_BOTTOM), "rectangle",
                            colorSupplier.getRandomColor());
                    break;
                case 3:
                    figures[i] = new RightTriangle(random.nextInt(UPPER_BOTTOM),
                            random.nextInt(UPPER_BOTTOM), "right triangle",
                            colorSupplier.getRandomColor());
                    break;
                default:
                    figures[i] = new Square(random.nextInt(UPPER_BOTTOM),
                            "square", colorSupplier.getRandomColor());
                    break;
            }
        }
        return figures;
    }
}
