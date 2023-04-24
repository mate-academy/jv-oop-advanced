package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Figure figure;
    ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();
    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(Color.values().length);
        switch (randomNumber) {
            case 0:
                figure = new Square(random.nextInt(20) + 1, figure.color);
                break;
            case 1:
                figure = new Rectangle(random.nextInt(20) + 1, random.nextInt(20) + 1, figure.color);
                break;
            case 2:
                figure = new RightTriangle(random.nextInt(20) + 1, random.nextInt(20) + 1, figure.color);
                break;
            case 3:
                figure = new Circle(random.nextInt(20) + 1, figure.color);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextInt(20) + 1, random.nextInt(20) + 1, random.nextInt(20) + 1, figure.color);
        }
        return figure;

    }
    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
