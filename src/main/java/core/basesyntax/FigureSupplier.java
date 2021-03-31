package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random figureNumber = new Random();
        Random figurePart = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figureNumber.nextInt(5) + 1) {
            case 1: return new Circle(figurePart.nextInt(10) + 1, colorSupplier.getRandomColor());
            case 2: return new Square(figurePart.nextInt(10) + 1, colorSupplier.getRandomColor());
            case 3: return new Triangle(figureNumber.nextInt(10) + 1, figureNumber.nextInt(10) + 1,
                    colorSupplier.getRandomColor());
            case 4: return new Rectangle(figureNumber.nextInt(10) + 1, figureNumber.nextInt(10) + 1,
                    colorSupplier.getRandomColor());
            case 5: return new Trapezoid(figureNumber.nextInt(10) + 1, figureNumber.nextInt(10) + 1,
                    colorSupplier.getRandomColor());
            default: return null;
        }
    }
}
