package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private static final int DEAFULT_SIZE = 10;
    private static final String DEAFULT_COLOR = "WHITE";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDeafultFigure() {
        return new Circle(DEAFULT_COLOR, DEAFULT_SIZE);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(Colors.values().length);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble(MAX_SIZE) + 1);
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble(MAX_SIZE) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_SIZE) + 1,
                        random.nextDouble(MAX_SIZE) + 1);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_SIZE) + 1,
                        random.nextDouble(MAX_SIZE) + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_SIZE) + 1,
                        random.nextDouble(MAX_SIZE) + 1,
                        random.nextDouble(MAX_SIZE) + 1);
            default: return getDeafultFigure();
        }
    }
}
