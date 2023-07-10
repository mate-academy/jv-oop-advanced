package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int PART_COUNT = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        int randomPart1 = random.nextInt(PART_COUNT);
        int randomPart2 = random.nextInt(PART_COUNT);
        int randomPart3 = random.nextInt(PART_COUNT);
        Figure figure = null;
        switch (figureNumber) {

            case 0: {
                figure = new Square(randomPart1, randomColor);
                break;

            }
            case 1: {
                figure = new Rectangle(randomPart1, randomPart2, randomColor);
                break;

            }
            case 2: {
                figure = new Circle(randomPart1, randomColor);
                break;
            }
            case 3: {
                figure = new RightTriangle(randomPart1, randomPart2, randomColor);
                break;

            }
            case 4: {
                figure = new IsoscelesTrapezoid(randomPart1, randomPart2, randomPart3, randomColor);
                break;

            }
            default: {
                System.out.println("Switch default");
                break;
            }

        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
