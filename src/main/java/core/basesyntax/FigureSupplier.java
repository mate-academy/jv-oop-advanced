package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT_FIGURE = 5;
    private static final double DEFAULT_RADIUS = 10d;
    private static final double MAX_LENGTH = 30d;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier(random);

    public Figure getRandomFigure() {

        int index = random.nextInt(MAX_COUNT_FIGURE);
        String randomColor = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                double radius = random.nextDouble() * MAX_LENGTH;
                return new Circle(randomColor, radius);
            case 1:
                double shortAxis = random.nextDouble() * MAX_LENGTH;
                double longAxis = random.nextDouble() * MAX_LENGTH;
                return new Square(randomColor, shortAxis, longAxis);
            case 2:
                double length = random.nextDouble() * MAX_LENGTH;
                double width = random.nextDouble() * MAX_LENGTH;

                return new Rectangle(randomColor, length, width);
            case 3:
                double firstLeg = random.nextDouble() * MAX_LENGTH;
                double secondLeg = random.nextDouble() * MAX_LENGTH;

                return new RightTriangle(randomColor, firstLeg, secondLeg);
            default:
                double upSide = random.nextDouble() * MAX_LENGTH;
                double downSide = random.nextDouble() * MAX_LENGTH;
                return new IsoscelesTrapezoid(randomColor,
                            upSide,
                            downSide,
                            random.nextDouble() * MAX_LENGTH);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
