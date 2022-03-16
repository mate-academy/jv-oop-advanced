package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;
    private FigureEnum figureEnum;
    private Random random;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public class ColorSupplier {
        public String getRandomColor() {
            return ColorEnum.values()[new Random().nextInt(ColorEnum.values().length)].toString();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    public Figure getRandomFigure() {
        Figure figure;
        figureEnum = FigureEnum.values()[random.nextInt(FigureEnum.values().length)];
        String color;

        int randomRadius;
        int randomSide;
        int randomSideA;
        int randomSideB;
        int randomHeight;

        switch (figureEnum) {
            case CIRCLE:
                randomRadius = random.nextInt(15) + 1;
                color = colorSupplier.getRandomColor();
                figure = new Circle(randomRadius, color);
                break;

            case SQUARE:
                randomSide = random.nextInt(15) + 1;
                color = colorSupplier.getRandomColor();
                figure = new Square(randomSide, color);
                break;

            case RECTANGLE:
                randomSideB = random.nextInt(15) + 1;
                randomSideA = random.nextInt(15) + 1;
                color = colorSupplier.getRandomColor();
                figure = new Rectangle(randomSideA, randomSideB, color);
                break;

            case RIGHT_TRIANGLE:
                randomSide = random.nextInt(15) + 1;
                color = colorSupplier.getRandomColor();
                figure = new RightTriangle(randomSide, color);
                break;

            case ISOSCELES_TRAPEZOID:
                randomSideA = random.nextInt(15) + 1;
                randomSideB = random.nextInt(15) + 1;
                randomHeight = random.nextInt(15) + 1;
                color = colorSupplier.getRandomColor();
                figure = new IsoscelesTrapezoid(randomSideA, randomSideB, randomHeight, color);
                break;

            default:
                figure = null;
                break;
        }
        return figure;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public FigureEnum getFigureEnum() {
        return figureEnum;
    }

    public void setFigureEnum(FigureEnum figureEnum) {
        this.figureEnum = figureEnum;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
