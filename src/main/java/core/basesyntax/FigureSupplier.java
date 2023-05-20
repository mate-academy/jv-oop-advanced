package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INDEX_FOR_FIGURE = 5;
    private static final int MAX_INDEX_FOR_PARAM = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randIndexForFigure = random.nextInt(MAX_INDEX_FOR_FIGURE);
        switch (randIndexForFigure) {
            case 0:
                double radiusCircle = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                String colorCircle = colorSupplier.getRandomColor();
                return new Circle(radiusCircle, colorCircle);
            case 1:
                double firstBaseIsTr = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                double secondBaseIsTr = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                double heightIsTr = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                String colorIsTr = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(firstBaseIsTr, secondBaseIsTr, heightIsTr, colorIsTr);
            case 2:
                double firstSideRect = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                double secondSideRect = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                String colorRect = colorSupplier.getRandomColor();
                return new Rectangle(firstSideRect, secondSideRect, colorRect);
            case 3:
                double firstLegRightTr = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                double secondLegRightTr = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                String colorRightTr = colorSupplier.getRandomColor();
                return new RightTriangle(firstLegRightTr, secondLegRightTr, colorRightTr);
            case 4:
                double sideSquare = random.nextInt(MAX_INDEX_FOR_PARAM) + 1;
                String colorSquare = colorSupplier.getRandomColor();
                return new Square(sideSquare, colorSquare);
            default:
                return this.getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
