package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        Color randomColor = getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(getRandomNumber(), randomColor);
            case 1:
                return new Square(getRandomNumber(), randomColor);
            case 2:
                return new Rectangle(getRandomNumber(), getRandomNumber(), randomColor);
            case 3:
                return new RightTriangle(getRandomNumber(), getRandomNumber(), randomColor);
            default:
                return new IsoscelesTrapezoid(
                        getRandomNumber(), getRandomNumber(), getRandomNumber(), randomColor
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.BLACK); // або BLACK, залежно від завдання
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_SIZE) + 1;
    }

    private Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}

