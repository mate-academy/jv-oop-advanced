package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();
        Circle circle = new Circle(color, 10);

        return circle;
    }

    public Figure getRandomFigure() {

        switch (random.nextInt(5)) {
            case 1: {
                String color = colorSupplier.getRandomColor();
                int property = random.nextInt();

                return new Circle(color, property);
            }
            case 2: {
                String color = colorSupplier.getRandomColor();
                int firstProperty = random.nextInt();
                int secondProperty = random.nextInt();

                return new IsoscelesTrapezoid(color, firstProperty, secondProperty);
            }
            case 3: {
                String color = colorSupplier.getRandomColor();
                int firstProperty = random.nextInt();
                int secondProperty = random.nextInt();

                return new Rectangle(color, firstProperty, secondProperty);
            }
            case 4: {
                String color = colorSupplier.getRandomColor();
                int firstProperty = random.nextInt();
                int secondProperty = random.nextInt();

                return new RightTriangle(color, firstProperty, secondProperty);
            }
            case 5: {
                String color = colorSupplier.getRandomColor();
                int property = random.nextInt();

                return new Square(color, property);
            }
            default: {
                return getDefaultFigure();
            }
        }
    }
}
