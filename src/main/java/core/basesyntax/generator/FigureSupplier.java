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

    public Figure[] generateFigure(int figuresCount) {
        Figure[] figures = new Figure[figuresCount];
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        for (int i = 0; i < figuresCount; i++) {
            int figureNumber = random.nextInt(NUMBER_OF_FIGURES);
            switch (figureNumber) {
                case 0:
                    figures[i] = new Circle(random.nextDouble() + random.nextInt(), "circle",
                            colorSupplier.setColors());
                    break;
                case 1:
                    figures[i] = new IsoscelesTrapezoid(random.nextDouble() + random.nextInt(),
                            random.nextDouble()
                                    + random.nextInt(), random.nextDouble()
                            + random.nextInt(), "isosceles trapezoid",
                            colorSupplier.setColors());
                    break;
                case 2:
                    figures[i] = new Rectangle(random.nextDouble() + random.nextInt(),
                            random.nextDouble()
                                    + random.nextInt(), "rectangle", colorSupplier.setColors());
                    break;
                case 3:
                    figures[i] = new RightTriangle(random.nextDouble() + random.nextInt(),
                            random.nextDouble()
                                    + random.nextInt(), "right triangle",
                            colorSupplier.setColors());
                    break;
                case 4:
                    figures[i] = new Square(random.nextDouble() + random.nextInt(),
                            "square", colorSupplier.setColors());
                    break;
                default:
                    break;
            }
        }
        return figures;
    }
}
