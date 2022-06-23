package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final double DEFAULT_RADIUS = 10;
    static final double MAX_LENGTH_OF_SIDE = 100.0;
    static final int COUNT_OF_FIGURES = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        double randomSide = random.nextDouble() * MAX_LENGTH_OF_SIDE;
        double secondRandomSide = random.nextDouble() * MAX_LENGTH_OF_SIDE;
        int randomIndex = random.nextInt(COUNT_OF_FIGURES);
        Figure randomFigure;
        switch (randomIndex) {
            case 0:
                randomFigure = new Circle(randomColor, randomSide);
                break;
            case 1:
                randomFigure = new Square(randomColor, randomSide);
                break;
            case 2:
                randomFigure = new Rectangle(randomColor, randomSide, secondRandomSide);
                break;
            case 3:
                randomFigure = new RightTriangle(randomColor, randomSide, secondRandomSide);
                break;
            case 4:
                double randomHeight = random.nextDouble() * MAX_LENGTH_OF_SIDE;
                randomFigure = new IsoscelesTrapezoid(randomColor, randomSide,
                        secondRandomSide, randomHeight);
                break;
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        String defaultColor = DEFAULT_COLOR.toString().toLowerCase();
        final Circle defaultFigure;
        defaultFigure = new Circle(defaultColor, DEFAULT_RADIUS);
        return defaultFigure;
    }
}
