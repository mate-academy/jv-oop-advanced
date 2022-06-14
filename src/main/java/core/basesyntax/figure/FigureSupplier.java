package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = FigureList.values().length;
    private static final int MAX_FIGURE_SIZE = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int sideA = random.nextInt(MAX_FIGURE_SIZE) + 1;
        int sideB = random.nextInt(MAX_FIGURE_SIZE) + 1;
        int height = random.nextInt(MAX_FIGURE_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                return new Square(sideA, color);
            case 1:
                return new Rectangle(sideA, sideB, color);
            case 2:
                return new RightTriangle(sideA, sideB, color);
            case 3:
                return new Circle(sideA, color);
            case 4:
                return new IsoscelesTrapezoid(sideA, sideB, height, color);
            default:
                return new RightTriangle(sideA, sideB, color);
        }
    }

    public Figure getDefaultFigure() {
        int sideA = 10;
        String color = Color.WHITE.toString();
        return new Circle(sideA,color);

    }

}
