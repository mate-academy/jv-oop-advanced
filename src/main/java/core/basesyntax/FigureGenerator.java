package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int LIMIT_NUMBER = 100;

    public Figure createFigure() {
        Random random = new Random();
        ColorGenerator colorGenerator = new ColorGenerator();

        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                return new Circle(random.nextInt(LIMIT_NUMBER), colorGenerator.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(LIMIT_NUMBER),
                        random.nextInt(LIMIT_NUMBER), colorGenerator.getRandomColor());
            case 3:
                return new Rectangle(random.nextInt(LIMIT_NUMBER), random.nextInt(LIMIT_NUMBER),
                        colorGenerator.getRandomColor());
            case 4:
                return new Square(random.nextInt(LIMIT_NUMBER), colorGenerator.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(LIMIT_NUMBER),
                        random.nextInt(LIMIT_NUMBER), random.nextInt(LIMIT_NUMBER),
                        colorGenerator.getRandomColor());
        }
    }
}
