package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_PROPERTY = 10;
    public static final int FIGURE_DEFAULT_PARAMETER = 10;
    public static final String COLOR_DEFAULT = "WHITE";
    private Random random = new Random();
    //private Figure figure;

    private ColorSupplier colorSupplier = new ColorSupplier();

    private String getColorRendom() {
        return colorSupplier.getRandomColor();
    }

    private int getParameterRendom() {
        return random.nextInt(FIGURE_PROPERTY);
    }

    public Figure getRandomFigure() {
        Figure figure;
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {

            case 1: {
                int radius = getParameterRendom();
                String color = getColorRendom();
                figure = new Circle(radius, color);
                break;
            }
            case 2: {
                int firstSide = getParameterRendom();
                int secondSide = getParameterRendom();
                int height = getParameterRendom();
                String color = getColorRendom();
                figure = new IsoscelesTrapezoid(color, firstSide, secondSide, height);
                break;
            }
            case 3: {
                int firstSide = getParameterRendom();
                int secondSide = getParameterRendom();
                String color = getColorRendom();
                figure = new Rectangle(color, firstSide, secondSide);
                break;
            }
            case 4: {
                int firstLeg = getParameterRendom();
                int secondLeg = getParameterRendom();
                String color = getColorRendom();
                figure = new RightTriangle(color, firstLeg, secondLeg);
                break;
            }
            default: {
                int side = random.nextInt(FIGURE_PROPERTY);
                String color = colorSupplier.getRandomColor();
                figure = new Square(color, side);
                break;
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(FIGURE_DEFAULT_PARAMETER, COLOR_DEFAULT);
    }
}
