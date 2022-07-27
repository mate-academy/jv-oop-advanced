package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figure = random.nextInt(5);
        int firstLag = random.nextInt(60);
        int secondLag = random.nextInt(70);
        int thirdLag = random.nextInt(80);
        String color = new ColorSupplier().getRandomColor();
        switch (figure) {
            case (1):
                return new Circle(firstLag, color);
            case (2):
                return new IsoscelesTrapezoid(firstLag, secondLag, thirdLag, color);
            case (3):
                return new Rectangle(firstLag, secondLag,color);
            case (4):
                return new RightTriangle(firstLag, secondLag,color);
            default:
                return new Square(firstLag, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
