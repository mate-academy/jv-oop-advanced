package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_FIGURE_PART_SIZE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomFiguresPartSize());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomFiguresPartSize(),
                        getRandomFiguresPartSize(),
                        getRandomFiguresPartSize());
            case 2:
                int height = getRandomFiguresPartSize();
                int width = getRandomFiguresPartSize();
                if (height == width) {
                    width += 1;
                }
                return new Rectangle(colorSupplier.getRandomColor(), height, width);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomFiguresPartSize(), getRandomFiguresPartSize());
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomFiguresPartSize());
        }
    }

    private int getRandomFiguresPartSize() {
        Random random = new Random();
        return 1 + random.nextInt(MAX_FIGURE_PART_SIZE);
    }
}
