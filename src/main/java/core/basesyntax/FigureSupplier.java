package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = Figures.values().length;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomSide());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomHeight(),
                        getRandomWidth());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomFirstLeg(),
                        getRandomSecondLeg());
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomRadius());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomHeight(),
                        getRandomFirstBase(),
                        getRandomSecondBase());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }

    public int getRandomSide() {
        return getRandomInt();
    }

    public int getRandomHeight() {
        return getRandomInt();
    }

    public int getRandomWidth() {
        return getRandomInt();
    }

    public int getRandomRadius() {
        return getRandomInt();
    }

    public int getRandomFirstBase() {
        return getRandomInt();
    }

    public int getRandomSecondBase() {
        return getRandomInt();
    }

    public int getRandomFirstLeg() {
        return getRandomInt();
    }

    public int getRandomSecondLeg() {
        return getRandomInt();
    }

    public int getRandomInt() {
        return random.nextInt(10) + 1;
    }
}
