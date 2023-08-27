package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int choice = random.nextInt(5); // Randomly choose one of the three figure types

        String color = colorSupplier.getRandomColor();
        double sideOrLeg1 = random.nextDouble() * 10 + 1; // Random side/leg between 1 and 11
        double sideOrLeg2 = random.nextDouble() * 10 + 1; // Random side/leg between 1 and 11

        switch (choice) {
            case 0:
                return new Square(color, sideOrLeg1);
            case 1:
                return new RightTriangle(color, sideOrLeg1, sideOrLeg2);
            case 2:
                return new Rectangle(color, sideOrLeg1, sideOrLeg2);
            case 3:
                return new Circle(color, sideOrLeg1);
            case 4:
                return new IsoscelesTrapezoid(color, sideOrLeg1, sideOrLeg2, sideOrLeg2 * 0.5);
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}

