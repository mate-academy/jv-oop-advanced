package figure;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_RANDOM_UNIT = 100;
    private static String[] figures = {"circle", "rectangle",
            "right triangle", "isosceles trapezoid", "square"};

    public static String getTypeName(int typeNumber) {
        return figures[typeNumber];
    }

    public static Double getRandomFigureValue() {
        return (new Random().nextInt(FIGURE_RANDOM_UNIT) + 1) * 0.01d;
    }

    public static Figure getRandomFigure() {
        Figure figure;
        int randomIndex = new Random().nextInt(FIGURE_COUNT);
        Double randomNumberOne = (new Random().nextInt(FIGURE_RANDOM_UNIT) + 1) * 0.01d;
        Double randomNumberTwo = (new Random().nextInt(FIGURE_RANDOM_UNIT) + 1) * 0.01d;
        Double randomNumberThree = (new Random().nextInt(FIGURE_RANDOM_UNIT) + 1) * 0.01d;
        switch (randomIndex) {
            case 0:
                figure = new Circle(getRandomColor(), randomNumberOne);
                break;
            case 1:
                figure = new Rectangle(getRandomColor(), randomNumberOne, randomNumberTwo);
                break;
            case 2:
                figure = new RightTriangle(getRandomColor(),randomNumberOne, randomNumberTwo);
                break;
            case 3:
                figure = new IsoscelesTrapezoid(getRandomColor(),
                        randomNumberOne, randomNumberTwo, randomNumberThree);
                break;
            case 4:
                figure = new Square(getRandomColor(),randomNumberOne);
                break;
            default:
                figure = new Figure(getRandomColor());
                break;
        }
        return figure;
    }
}
