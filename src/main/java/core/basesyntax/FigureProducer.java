package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Shape;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Triangle;
import java.util.HashMap;
import java.util.Map;

public class FigureProducer {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final int NUMBER_OF_COLORS = 3;
    private static final HashMap<Integer, String> colors = new HashMap<>(
            Map.of(1, "Red", 2, "Green", 3, "Blue")
    );

    public static Shape[] generateFigures(int count) {
        Shape[] figures = new Shape[RandomNumber.getRandomNumber(count)];

        for (int i = 0; i < figures.length; i++) {
            switch (RandomNumber.getRandomNumber(NUMBER_OF_FIGURES)) {
                case 1: {
                    figures[i] = new Square(RandomNumber.getRandomNumber(20));
                    break;
                }
                case 2: {
                    figures[i] = new Triangle(RandomNumber.getRandomNumber(20));
                    break;
                }
                case 3: {
                    figures[i] = new Rectangle(RandomNumber.getRandomNumber(20),
                            RandomNumber.getRandomNumber(20));
                    break;
                }
                case 4: {
                    figures[i] = new RightTriangle(RandomNumber.getRandomNumber(20),
                            RandomNumber.getRandomNumber(20));
                    break;
                }
                case 5: {
                    figures[i] = new Circle(RandomNumber.getRandomNumber(20));
                    break;
                }
                case 6: {
                    figures[i] = new IsoscelesTrapezoid(RandomNumber.getRandomNumber(20),
                            RandomNumber.getRandomNumber(20), RandomNumber.getRandomNumber(20));
                    break;
                }
                default: break;
            }
        }

        return figures;
    }

    public static String generateColor() {
        return colors.get(RandomNumber.getRandomNumber(NUMBER_OF_COLORS));
    }

}
