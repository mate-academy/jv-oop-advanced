package core.basesyntax.supliers;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int RANDOM_SIDE_LENGTH_BOUND = 15;
    private static final int RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();
        Figure figure;
        switch (figureNumber) {
            case 0:
                int side = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                figure = new Square(color, side);
                break;
            case 1:
                int horizontalSide = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                int verticalSide = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                figure = new Rectangle(color,horizontalSide,verticalSide);
                break;
            case 2:
                int base = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                int height = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                int upperSide = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                figure = new IsoscelesTrapezoid(color,base, height, upperSide);
                break;
            case 3:
                int firstLeg = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                int secondLeg = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                figure = new RightTriangle(color, firstLeg, secondLeg);
                break;
            case 4:
                int radius = random.nextInt(RANDOM_SIDE_LENGTH_BOUND) + 1;
                figure = new Circle(color,radius);
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, RADIUS);
    }
}
