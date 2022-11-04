package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_PROPERTY = 10;
    public static final int FIGURE_PROPERTY_DEFAULT = 10;
    public static final String COLOR_DEFAULT = "WHITE";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private String getColorRandom() {
        return colorSupplier.getRandomColor();
    }

    private int getParameterRendom() {
        return random.nextInt(FIGURE_PROPERTY);
    }

    private Figure getRandomCircle() {
        int radius = getParameterRendom();
        String color = getColorRandom();
        return new Circle(radius, color);
    }

    private Figure getRandomIsoTrap() {
        int firstSide = getParameterRendom();
        int secondSide = getParameterRendom();
        int height = getParameterRendom();
        String color = getColorRandom();
        return new IsoscelesTrapezoid(color, firstSide, secondSide, height);
    }

    private Figure getRandomRectangle() {
        int firstSide = getParameterRendom();
        int secondSide = getParameterRendom();
        int height = getParameterRendom();
        String color = getColorRandom();
        return new Rectangle(color, firstSide, secondSide);
    }

    private Figure getRandomRightTriangle() {
        int firstLeg = getParameterRendom();
        int secondLeg = getParameterRendom();
        String color = getColorRandom();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        int side = getParameterRendom();
        String color = getColorRandom();
        return new Square(color, side);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);

        switch (figureNumber) {

            case 0: {
                return getRandomCircle();
            }
            case 1: {
                return getRandomRectangle();
            }
            case 2: {
                return getRandomIsoTrap();
            }
            case 3: {
                return getRandomRightTriangle();
            }
            default: {
                return getRandomSquare();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FIGURE_PROPERTY_DEFAULT, COLOR_DEFAULT);
    }
}
