package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                double side = random.nextDouble() * 10 + 1;
                return new Square(randomColor, side);
            case 1:
                double length = random.nextDouble() * 10 + 1;
                double width = random.nextDouble() * 10 + 1;
                return new Rectangle(randomColor, length, width);
            case 2:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(randomColor, radius);
            case 4:
                double topBase = random.nextDouble() * 10 + 1;
                double bottomBase = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, height);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);

    }
}


