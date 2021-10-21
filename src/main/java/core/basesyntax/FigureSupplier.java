package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int PARAMETRE = 20;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_PARAMETRE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_COUNT);
        switch (number) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETRE));
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETRE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETRE),
                        random.nextInt(PARAMETRE));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETRE),
                        random.nextInt(PARAMETRE),
                        random.nextInt(PARAMETRE));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(PARAMETRE),
                        random.nextInt(PARAMETRE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_PARAMETRE);
    }
}
