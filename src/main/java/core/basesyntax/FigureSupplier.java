package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure randomFigure;
    private final Figure defaultFigure = new Circle(10, Color.WHITE.name());

    private int getRandomSide() {
        return random.nextInt((100 - 1) + 1) + 1;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                randomFigure = new Square(getRandomSide(), colorSupplier.getRandomColor());
                break;
            case 2:
                randomFigure = new Circle(getRandomSide(), colorSupplier.getRandomColor());
                break;
            case 3:
                randomFigure = new RightTriangle(getRandomSide(), getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
                break;
            case 4:
                randomFigure = new Rectangle(getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
                break;
            default:
                randomFigure = new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
