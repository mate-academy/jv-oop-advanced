package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private ColorSuplier colorSuplier;
    private Random random;

    public FigureSuplier() {
        colorSuplier = new ColorSuplier();
        random = new Random();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, colorSuplier.getDefaultColor());
    }

    public Figure getRandomFigure() {
        Figure figure;

        switch (FigureType.values()[random.nextInt(FigureType.values().length)]) {
            case CIRCLE:
                figure = getRandomCircle(colorSuplier.getRandomColor());
                break;
            case SQUARE:
                figure = getRandomSquare(colorSuplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = getRandomRectangle(colorSuplier.getRandomColor());
                break;
            case RIGHT_TRIANGLE:
                figure = getRandomRightTriangle(colorSuplier.getRandomColor());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = getRandomIsoscelesTrapezoid(colorSuplier.getRandomColor());
                break;
            default:
                figure = getDefaultFigure();
        }

        return figure;
    }

    private Figure getRandomIsoscelesTrapezoid(Color color) {
        double base = Math.abs(random.nextDouble() * random.nextInt());
        double top = Math.abs(random.nextDouble() * random.nextInt());
        double leg = Math.abs(random.nextDouble() * random.nextInt());
        return new IsoscelesTrapezoid(base, top, leg, color);
    }

    private Figure getRandomRightTriangle(Color color) {
        double firstLeg = Math.abs(random.nextDouble() * random.nextInt());
        double secondLeg = Math.abs(random.nextDouble() * random.nextInt());
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomRectangle(Color color) {
        double width = Math.abs(random.nextDouble() * random.nextInt());
        double height = Math.abs(random.nextDouble() * random.nextInt());
        return new Rectangle(width, height, color);
    }

    private Figure getRandomSquare(Color color) {
        double side = Math.abs(random.nextDouble() * random.nextInt());
        return new Square(side, color);
    }

    private Figure getRandomCircle(Color color) {
        double radius = Math.abs(random.nextDouble() * random.nextInt());
        return new Circle(radius, color);
    }
}

