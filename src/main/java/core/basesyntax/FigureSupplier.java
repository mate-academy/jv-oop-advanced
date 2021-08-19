package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LIMIT = 5;
    private Random random = new Random();
    private int randomSideOne = random.nextInt(100);
    private int randomSideTwo = random.nextInt(100);
    private int randomSideThree = random.nextInt(100);
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        int randomCase = random.nextInt(FIGURE_LIMIT) + 1;
        Figure figure = null;
        switch (randomCase) {
            case 1:
                figure = new Circle(color, randomSideOne);
                break;
            case 2:
                figure = new IsoscelesTrapezoid(color, randomSideOne,
                            randomSideTwo, randomSideThree);
                break;
            case 3:
                figure = new Rectangle(color, randomSideOne, randomSideTwo);
                break;
            case 4:
                figure = new RightTriangle(color, randomSideOne, randomSideThree);
                break;
            case 5:
                figure = new Square(color, randomSideTwo);
                break;
            default:
                break;
        }
        return figure;
    }
}

