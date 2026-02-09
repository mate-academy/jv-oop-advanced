package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure generateRandomFigure() {
        Figures[] figures = Figures.values();
        int randomFigureIndex = new Random().nextInt(figures.length);

        String randomFigure = figures[randomFigureIndex].name();

        return switch (randomFigure) {
            case "CIRCLE" -> Circle.getRandomCircle();
            case "RECTANGLE" -> Rectangle.getRandomRectangle();
            case "SQUARE" -> Square.getRandomSquare();
            case "RIGHT_TRIANGLE" -> RightTriangle.getRandomRightRectangle();
            case "ISOSCELES_TRAPEZOID" -> IsoscelesTrapezoid.getReandomIsoscelesTrapezoid();
            default -> throw new IllegalStateException("Unexpected value: " + randomFigure);
        };
    }

}
