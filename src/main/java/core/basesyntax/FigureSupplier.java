package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUES_OF_SIDE = 20;
    private static final int MAX_RADIUS = 15;
    private static final int UNIQUE_RADIUS = 10;
    private static final int VALUES_OF_FIGURES = 5;

    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private Figure circleDefault = new Circle(UNIQUE_RADIUS, Color.WHITE.name());

    public int randomNumber() {
        return random.nextInt(MAX_VALUES_OF_SIDE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(VALUES_OF_FIGURES);
        Figure randomFigure;
        switch (index) {
            case 0:
                randomFigure = new Rectangle(randomNumber(),
                        randomNumber(), color.getRandomColor());
                break;
            case 1:
                randomFigure = new Circle(random.nextInt(MAX_RADIUS), color.getRandomColor());
                break;
            case 2:
                randomFigure = new Square(randomNumber(), color.getRandomColor());
                break;
            case 3:
                randomFigure = new RightTriangle(randomNumber(),
                        randomNumber(), color.getRandomColor());
                break;
            case 4:
                randomFigure = new IsoscelesTrapezoid(randomNumber(),
                        randomNumber(), randomNumber(), color.getRandomColor());
                break;
            default:
                randomFigure = new Rectangle(randomNumber(),
                        randomNumber(), color.getRandomColor());
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return circleDefault;
    }
}
