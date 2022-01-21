package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RADIUS = 10;
    public static final int FIGURE_QUANTITY = 4;

    public Figure getRandomFigure() {
        Random random = new Random();
        Figure randomFigure;
        String randomColor = Colors.values()[random.nextInt(Colors.values().length)].toString();
        int randomNumber = random.nextInt(FIGURE_QUANTITY + 1);
        switch (randomNumber) {
            case 0:
                randomFigure = new Circle(randomColor, random.nextDouble());
                break;
            case 1:
                randomFigure = new Square(randomColor, random.nextDouble());
                break;
            case 2:
                randomFigure = new IsoscelesTrapezoid(randomColor,
                        random.nextDouble(), random.nextDouble(), random.nextDouble());
                break;
            case 3:
                randomFigure = new Rectangle(randomColor, random.nextDouble(), random.nextDouble());
                break;
            default:
                randomFigure = new RightTriangle(randomColor,
                        random.nextDouble(), random.nextDouble());
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), RADIUS);
    }
}
