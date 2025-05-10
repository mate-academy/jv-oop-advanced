package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSuplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        String color = colorSuplier.getRandomColor();
        int firstRandomNumber = new Random().nextInt(100);
        int secondRandomNumber = new Random().nextInt(100);
        int thirdRandomNumber = new Random().nextInt(50);
        switch (index) {
            case 1:
                return new Square(color, firstRandomNumber);
            case 2:
                return new Circle(color, firstRandomNumber);
            case 3:
                return new Rectangle(color, firstRandomNumber, secondRandomNumber);
            case 4:
                return new RightTriangle(color, firstRandomNumber, secondRandomNumber);
            default:
                return new IsoscelesTrapezoid(color, firstRandomNumber, secondRandomNumber,
                        thirdRandomNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }
}
