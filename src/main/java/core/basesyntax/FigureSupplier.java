package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier color = new ColorSupplier();
        String randomColor = color.getRandomColor();
        int randomNumber = new Random().nextInt(21) + 1;
        int randomFigure = new Random().nextInt(5) + 1;

        switch (randomFigure) {
            case 1:
                return new Square(randomColor, randomNumber);
            case 2:
                return new Circle(randomColor, randomNumber);
            case 3:
                return new Rectangle(randomColor, randomNumber, randomNumber);
            case 4:
                return new RightTriangle(randomColor, randomNumber, randomNumber);
            case 5:
                return new IsoscelesTrapezoid(randomColor, randomNumber,
                        randomNumber, randomNumber);
            default:
                System.out.println("Error");
        }
        return null;
    }

    //this method should always return a white circle with a radius of 10.
    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
