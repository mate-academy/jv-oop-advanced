package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_RANDOM_NUMBER);
        Figure randomFigure = new Circle(color, radius);

        if (figureNumber == 1) {
            int baseSide = random.nextInt(MAX_RANDOM_NUMBER);
            int upSide = random.nextInt(MAX_RANDOM_NUMBER);
            int height = random.nextInt(MAX_RANDOM_NUMBER);
            randomFigure = new IsoscelesTrapezoid(color,baseSide,upSide,height);
        } else if (figureNumber == 2) {
            int shortSide = random.nextInt(MAX_RANDOM_NUMBER);
            int longSide = random.nextInt(MAX_RANDOM_NUMBER);
            randomFigure = new Rectangle(color,shortSide,longSide);
        } else if (figureNumber == 3) {
            int firstLeg = random.nextInt(MAX_RANDOM_NUMBER);
            int secondLeg = random.nextInt(MAX_RANDOM_NUMBER);
            randomFigure = new RightTriangle(color, firstLeg,secondLeg);
        } else if (figureNumber == 4) {
            int side = random.nextInt(MAX_RANDOM_NUMBER);
            randomFigure = new Square(color, side);
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

}
