package figure;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RANDOM_UNIT = 100;

    public static Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(FIGURE_COUNT);
        switch (randomIndex) {
            case 1:
                return new Rectangle(getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            case 2:
                return new RightTriangle(getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            case 3:
                return new IsoscelesTrapezoid(getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            case 4:
                return new Square(getRandomColor(),(new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            default:
                return new Circle(getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
        }
    }

    public static Figure[] createRandomArrayOfFigures(int countFigure) {
        Figure[] figuresArray = new Figure[countFigure];
        for (int i = 0; i < countFigure; i++) {
            figuresArray[i] = getRandomFigure();
        }
        return figuresArray;
    }
}
