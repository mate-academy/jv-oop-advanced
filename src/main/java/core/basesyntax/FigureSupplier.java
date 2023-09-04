package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier cs = new ColorSupplier();
    private final static int DEFAULT_SIZE_BOUND = 100;
    private final static int NUMBER_OF_FIGURE_CLASSES = 5;
    private final static int DEFAULT_RADIUS = 10;
    private final static String DEFAULT_COLOR = "WHITE";

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int whatFigureWillItBe = random.nextInt(NUMBER_OF_FIGURE_CLASSES);
        Figure randomFigure;
        switch (whatFigureWillItBe) {
            case 0:
                randomFigure = new Circle(cs.getRandomColor(),
                        random.nextInt(DEFAULT_SIZE_BOUND));
                break;
            case 1:
                randomFigure = new Square(cs.getRandomColor(),
                        random.nextInt(DEFAULT_SIZE_BOUND));
                break;
            case 2:
                randomFigure = new Rectangle(cs.getRandomColor(),
                        random.nextInt(DEFAULT_SIZE_BOUND),
                        random.nextInt(DEFAULT_SIZE_BOUND));
                break;
            case 3:
                randomFigure = new RightTriangle(cs.getRandomColor(),
                        random.nextInt(DEFAULT_SIZE_BOUND), random.nextInt(DEFAULT_SIZE_BOUND));
                break;
            case 4:
                randomFigure = new IsoscelesTrapezoid(cs.getRandomColor(),
                        random.nextInt(DEFAULT_SIZE_BOUND), random.nextInt(DEFAULT_SIZE_BOUND),
                        random.nextInt(DEFAULT_SIZE_BOUND));
                break;
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }
}
