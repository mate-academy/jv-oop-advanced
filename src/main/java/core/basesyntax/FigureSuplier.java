package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_NUM = 16;
    private ColorSuplier colorSuplier = new ColorSuplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(MAX_NUM);
        switch (randomNumber) {
            case 1:
                return new Circle(colorSuplier.getRandomColor(), randomNumber);
            case 2:
                return new IsoscelesTrapezoid(colorSuplier.getRandomColor(),
                        randomNumber, randomNumber, randomNumber);
            case 3:
                return new Square(colorSuplier.getRandomColor(), randomNumber);
            case 4:
                return new RightTriangle(colorSuplier.getRandomColor(), randomNumber, randomNumber);
            default:
                return new Rectangle(colorSuplier.getRandomColor(), randomNumber, randomNumber);

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

