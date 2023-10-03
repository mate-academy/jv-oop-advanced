package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIOUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private ColorSupplier colorSupplier;

    private Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(getRandomNumber(), color.toString());
            case 1:
                return new Rectangle(getRandomNumber(), getRandomNumber(), color.toString());
            case 2:
                return new RightTriangle(getRandomNumber(), getRandomNumber(), color.toString());
            case 3:
                return new Circle(getRandomNumber(), color.toString());
            case 4:
                return new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(), getRandomNumber(), color.toString());
            default:
                return new Circle(DEFAULT_RADIOUS, DEFAULT_COLOR.toString());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIOUS, DEFAULT_COLOR.toString());
    }

    private double getRandomNumber() {
        return random.nextDouble() * 20 + 1;
    }
}
