package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private static final int VALUE_TO_RANDOM = 50;
    private static final int FIGURE_AMMOUNT = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        int randomFigure = randomNumber.nextInt(FIGURE_AMMOUNT);
        switch (randomFigure) {
            case 0: //Circle
                int radius = 0;
                while (radius == 0) {
                    radius = randomNumber.nextInt(VALUE_TO_RANDOM);
                }
                return new Circle(radius,colorSupplier.getRandomColor());
            case 1: // IsoscelesTrapezoid
                int downSide = 0;
                int upSide = 0;
                int side = 0;
                while (downSide == 0 && upSide == 0 && side == 0) {
                    downSide = randomNumber.nextInt(VALUE_TO_RANDOM);
                    upSide = randomNumber.nextInt(VALUE_TO_RANDOM);
                    side = randomNumber.nextInt(VALUE_TO_RANDOM);
                }
                return new IsoscelesTrapezoid(downSide,upSide,side,colorSupplier.getRandomColor());
            case 3: // rectangle
                int width = 0;
                int height = 0;
                while (width == 0 && height == 0) {
                    width = randomNumber.nextInt(VALUE_TO_RANDOM);
                    height = randomNumber.nextInt(VALUE_TO_RANDOM);
                }
                return new Rectangle(width,height,colorSupplier.getRandomColor());
            case 4: //right triangle
                int firstLeg = 0;
                int secondLeg = 0;
                while (firstLeg == 0 && secondLeg == 0) {
                    firstLeg = randomNumber.nextInt(VALUE_TO_RANDOM);
                    secondLeg = randomNumber.nextInt(VALUE_TO_RANDOM);
                }
                return new RightTriangle(firstLeg,secondLeg,colorSupplier.getRandomColor());
            default: //Square
                int sideSquare = 0;
                while (sideSquare == 0) {
                    sideSquare = randomNumber.nextInt(VALUE_TO_RANDOM);
                }
                return new Square(sideSquare,colorSupplier.getRandomColor());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
