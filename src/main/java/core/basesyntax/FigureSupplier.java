package core.basesyntax;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {

    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        double randomDouble = 0;
        int choseFigure = random.nextInt(FIGURE_COUNT);
        switch (choseFigure) {

            case 0:
                randomDouble = 0.01 + random.nextDouble() * (100.0 - 0.01);
                Circle circle = new Circle(color.getRandomColor(), randomDouble);
                return circle;

            case 1:
                randomDouble = 0.01 + random.nextDouble() * (100.0 - 0.01);
                IsoscelesTrapezoid isoscelesTrapezoid
                        = new IsoscelesTrapezoid(color.getRandomColor(),
                        randomDouble, randomDouble, randomDouble);
                return isoscelesTrapezoid;

            case 2:
                randomDouble = 0.01 + random.nextDouble() * (100.0 - 0.01);
                Rectangle rectangle = new Rectangle(color.getRandomColor(),
                        randomDouble, randomDouble);
                return rectangle;

            case 3:
                randomDouble = 0.01 + random.nextDouble() * (100.0 - 0.01);
                RightTriangle rightTriangle = new RightTriangle(color.getRandomColor(),
                        randomDouble, randomDouble);
                return rightTriangle;

            case 4:
                randomDouble = 0.01 + random.nextDouble() * (100.0 - 0.01);
                Square square = new Square(color.getRandomColor(), randomDouble);
                return square;

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {

        Circle circle = new Circle("BIAŁY", 10);
        return circle;
    }
}
