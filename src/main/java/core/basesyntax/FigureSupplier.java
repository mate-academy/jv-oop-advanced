package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private int getRandomValue() {
        Random random = new Random();
        int randomValue = random.nextInt(20);
        return randomValue;
    }

    public Figure getRandomFigure() {

        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        int index = random.nextInt(5);
        switch (index) {
            case 0:
                return new Circle(randomColor, getRandomValue());

            case 1:
                return new IsoscelesTrapezoid(randomColor, getRandomValue(), getRandomValue(), getRandomValue());

            case 2:
                return new Rectangle(randomColor, getRandomValue(), getRandomValue());

            case 3:
                return new RightTriangle(randomColor, getRandomValue(), getRandomValue());

            case 4:
                return new Square(randomColor, getRandomValue());

        }

        return null;
    }


    public Figure getDefaultFigure() {
        Figure whiteCircle = new Circle("white", 10);
        return whiteCircle;
    }
}
