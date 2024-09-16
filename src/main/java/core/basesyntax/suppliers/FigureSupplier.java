package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Form;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX = 100;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int DEFAULT_RADIUS = 10;

    private Random randomNumber = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = randomNumber.nextInt(Form.values().length);
        Form figureForm = Form.values()[index];
        String figureColor = colorSupplier.getRandomColor();
        switch (figureForm) {
            case CIRCLE:
                return new Circle(randomNumber.nextInt(MAX) + 1, figureColor);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(figureColor, randomNumber.nextInt(MAX) + 1,
                        randomNumber.nextInt(MAX) + 1, randomNumber.nextInt(MAX) + 1);
            case SQUARE:
                return new Square(randomNumber.nextInt(MAX) + 1, figureColor);
            case RECTANGLE:
                return new Rectangle(randomNumber.nextInt(MAX) + 1,
                        randomNumber.nextInt(MAX) + 1, figureColor);
            default:
                return new RightTriangle(randomNumber.nextInt(MAX) + 1,
                        randomNumber.nextInt(MAX) + 1,
                        randomNumber.nextInt(MAX) + 1,
                        figureColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
