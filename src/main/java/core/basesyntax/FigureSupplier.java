package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);

        if (randomNumber == 0) {
            figure = new Square(colorSupplier.getRandomColor(), randomNumber + 10);
        }
        if (randomNumber == 1) {
            figure = new Rectangle(colorSupplier.getRandomColor(), (double)randomNumber + 10,
                    (double)randomNumber + 11);
        }
        if (randomNumber == 2) {
            figure = new RightTriangle(colorSupplier.getRandomColor(), (double)randomNumber + 10,
                    (double)randomNumber + 11);
        }
        if (randomNumber == 3) {
            figure = new Circle(colorSupplier.getRandomColor(), (double)randomNumber + 10);
        }
        if (randomNumber == 4) {
            figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), (double)randomNumber + 10,
                    (double)randomNumber + 11, (double)randomNumber + 12);
        }
        return figure;
    }

    public Figure getDefaultFigure(){
        return new Circle("White", 10.0);
    }
}
