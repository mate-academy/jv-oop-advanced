package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        double randomValue1 = random.nextDouble() * 10 + 1;
        double randomValue2 = random.nextDouble() * 10 + 1;
        double randomValue3 = random.nextDouble() * 10 + 1;

        Figure figure = null;

        switch (figureType) {
            case 0: // Kwadrat
                return new Square(randomValue1, color);
            case 1: // Prostokąt
                return new Rectangle(randomValue1, randomValue2, color);
            case 2: // Trójkąt prostokątny
                return new RightTriangle(randomValue1, randomValue2, color);
            case 3: // Koło
                return new Circle(randomValue1, color);
            case 4: // Trapez równoramienny
                return new IsoscelesTrapezoid(randomValue1, randomValue2, randomValue3, color);
            default: // Nie powinno się zdarzyć
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
