package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private SecureRandom secureRandom = new SecureRandom();

    public Figure getRandomFigure() {
        int randomInt = secureRandom.nextInt(5 - 1) + 1;
        switch (randomInt) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), secureRandom.nextDouble() * 10);
            case 2:
                return new IsoscelesTrapezoid(secureRandom.nextDouble() * 10,
                        secureRandom.nextDouble() * 10, secureRandom.nextDouble()
                        * 10, colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), secureRandom.nextDouble() * 10,
                        secureRandom.nextDouble() * 10);
            case 4:
                return new Rectangle(secureRandom.nextDouble() * 10,
                        secureRandom.nextDouble() * 10, colorSupplier.getRandomColor());
            case 5:
                return new Square(secureRandom.nextDouble() * 10, colorSupplier.getRandomColor());
            default:
                return new Circle("white", 10);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
