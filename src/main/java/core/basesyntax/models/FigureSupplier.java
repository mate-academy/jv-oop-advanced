package core.basesyntax.models;

import core.basesyntax.models.painter.Color;
import core.basesyntax.models.painter.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final double PROPERTY_MULTIPLIER = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final Figures DEFAULT_FIGURE = Figures.CIRCLE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Figure getDefaultFigure() {
        return createFigure(DEFAULT_FIGURE);
    }

    public Figure getRandomFigure() {
        int randFigureIndex = random.nextInt(Figures.values().length);
        Figure figure = createFigure(Figures.values()[randFigureIndex]);
        return randomizeProperties(figure);
    }

    private Figure createFigure(Figures newFigure) {
        switch (newFigure) {
            case CIRCLE:
                return createCircle();
            case ISOSCELESTRAPEZOID:
                return createIsoscelesTrapezoid();
            case RECTANGLE:
                return createRectangle();
            case RIGHTTRIANGLE:
                return createRightTriangle();
            case SQUARE:
                return createSquare();
            default:
                return getDefaultFigure();
        }
    }

    private Circle createCircle() {
        return new Circle(DEFAULT_COLOR.name(), PROPERTY_MULTIPLIER);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                DEFAULT_COLOR.name(), PROPERTY_MULTIPLIER, PROPERTY_MULTIPLIER, PROPERTY_MULTIPLIER
        );
    }

    private Rectangle createRectangle() {
        return new Rectangle(DEFAULT_COLOR.name(), PROPERTY_MULTIPLIER, PROPERTY_MULTIPLIER);
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(DEFAULT_COLOR.name(), PROPERTY_MULTIPLIER, PROPERTY_MULTIPLIER);
    }

    private Square createSquare() {
        return new Square(DEFAULT_COLOR.name(), PROPERTY_MULTIPLIER);
    }

    private Figure randomizeProperties(Figure figure) {
        Figures figureType = Figures.valueOf(figure.getClass().getSimpleName().toUpperCase());
        switch (figureType) {
            case CIRCLE:
                Circle circle = (Circle) figure;
                circle.setRadius(random.nextDouble() * PROPERTY_MULTIPLIER);
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case ISOSCELESTRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid = (IsoscelesTrapezoid) figure;
                isoscelesTrapezoid.setTopSide(random.nextDouble() * PROPERTY_MULTIPLIER);
                isoscelesTrapezoid.setHeight(random.nextDouble() * PROPERTY_MULTIPLIER);
                isoscelesTrapezoid.setBottomSide(random.nextDouble() * PROPERTY_MULTIPLIER);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case RECTANGLE:
                Rectangle rectangle = (Rectangle) figure;
                rectangle.setHeight(random.nextDouble() * PROPERTY_MULTIPLIER);
                rectangle.setBottom(random.nextDouble() * PROPERTY_MULTIPLIER);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case RIGHTTRIANGLE:
                RightTriangle rightTriangle = (RightTriangle) figure;
                rightTriangle.setBase(random.nextDouble() * PROPERTY_MULTIPLIER);
                rightTriangle.setHeight(random.nextDouble() * PROPERTY_MULTIPLIER);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case SQUARE:
                Square square = (Square) figure;
                square.setSide(random.nextDouble() * PROPERTY_MULTIPLIER);
                square.setColor(colorSupplier.getRandomColor());
                return square;
            default:
                throw new RuntimeException("Unable to randomize");
        }
    }
}
