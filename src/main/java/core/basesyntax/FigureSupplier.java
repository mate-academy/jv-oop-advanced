package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 6;
    public static final int MAX_SIDE_LENGTH = 101;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int figureType = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();
        if (figureType == 1) {
            double radius = random.nextInt(1, MAX_SIDE_LENGTH);
            figure = new Circle(radius, color);
        } else if (figureType == 2) {
            double firstBase = random.nextInt(1, MAX_SIDE_LENGTH);
            double secondBase = random.nextInt(1, MAX_SIDE_LENGTH);
            double height = random.nextInt(1, MAX_SIDE_LENGTH);
            figure = new IsoscelesTrapezoid(firstBase, secondBase, height, color);
        } else if (figureType == 3) {
            double firstSide = random.nextInt(1, MAX_SIDE_LENGTH);
            double secondSide = random.nextInt(1, MAX_SIDE_LENGTH);
            figure = new Rectangle(firstSide, secondSide, color);
        } else if (figureType == 4) {
            double firstLeg = random.nextInt(1, MAX_SIDE_LENGTH);
            double secondLeg = random.nextInt(1, MAX_SIDE_LENGTH);
            figure = new RightTriangle(firstLeg, secondLeg, color);
        } else {
            double side = random.nextInt(1, MAX_SIDE_LENGTH);
            figure = new Square(side, color);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
