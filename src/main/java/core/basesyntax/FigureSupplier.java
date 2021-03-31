package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorGenerator = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigures = 5;
        int number = new Random().nextInt(numberOfFigures);
        switch (number) {
            case 1:
                return createCircle();
            case 2:
                return createIsoscelesTrapezoid();
            case 3:
                return createRectangle();
            case 4:
                return createRightTriangle();
            default:
                return createSquare();
        }
    }

    public int getRandomNumber() {
        int range = 100;
        return new Random().nextInt(range);
    }

    private Figure createCircle() {
        String color = colorGenerator.randomColor();
        int radius = getRandomNumber();
        return new Circle(radius, color, "radius");
    }

    private Figure createIsoscelesTrapezoid() {
        String color = colorGenerator.randomColor();
        int height = getRandomNumber();
        int mediumLine = getRandomNumber();
        return new IsoscelesTrapezoid(height,mediumLine,color,"medium line");
    }

    private Figure createRectangle() {
        String color = colorGenerator.randomColor();
        int height = getRandomNumber();
        int width = getRandomNumber();
        return new Rectangle(height, width, color, "width");
    }

    private Figure createRightTriangle() {
        String color = colorGenerator.randomColor();
        int legOne = 0;
        int legTwo = 0;
        int hypotenuse = 0;
        while (legOne + legTwo <= hypotenuse) {
            legOne = getRandomNumber();
            legTwo = getRandomNumber();
            hypotenuse = getRandomNumber();
        }
        return new RightTriangle(legOne, legTwo, hypotenuse,
                color, "hypotenuse");
    }

    private Figure createSquare() {
        String color = colorGenerator.randomColor();
        int side = getRandomNumber();
        return new Square(side, color, "side");
    }
}
