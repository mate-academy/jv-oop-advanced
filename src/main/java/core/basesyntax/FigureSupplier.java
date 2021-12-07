package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();

    public Figure getDefaultFigure() {

        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure() {

        FigureType[] figureTypes = FigureType.values();
        FigureType randomFigureType = figureTypes[random.nextInt(figureTypes.length)];
        Color[] colors = Color.values();
        Color randomColor = colors[random.nextInt(colors.length)];

        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        int randomNumber3 = random.nextInt(100);

        Figure figure = getDefaultFigure();

        switch (randomFigureType) {
            case CIRCLE:
                figure = new Circle(randomNumber1, randomColor);
                break;
            case SQUARE:
                figure = new Square(randomNumber1, randomColor);
                break;
            case RECTANGLE:
                figure = new Rectangle(randomNumber1, randomNumber2, randomColor);
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(randomNumber1, randomNumber2, randomColor);
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(randomNumber1,
                        randomNumber2,
                        randomNumber3,
                        randomColor);
                break;
            default:
                break;
        }

        return figure;
    }
}
