package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figure = random.nextInt(5);
        int firstParametr = random.nextInt(60) + 1;
        int secondParametr = random.nextInt(70) + 1;
        int thirdParametr = random.nextInt(80) + 1;
        String color = new ColorSupplier().getRandomColor();
        switch (figure) {
            case (1):
                return new Circle(firstParametr, color);
            case (2):
                return new IsoscelesTrapezoid(firstParametr, secondParametr, thirdParametr, color);
            case (3):
                return new Rectangle(firstParametr, secondParametr,color);
            case (4):
                return new RightTriangle(firstParametr, secondParametr,color);
            default:
                return new Square(firstParametr, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
