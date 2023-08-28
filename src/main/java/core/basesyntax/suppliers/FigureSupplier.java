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
    public static final int MAX = 100; //Max value for side/radius
    public static final int MIN = 1; //Min value for side/radius
    private Random randomNumber = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = randomNumber.nextInt(Form.values().length);
        Form figureForm = Form.values()[index];
        String figureColor = colorSupplier.getRandomColor();
        switch (figureForm) {
            case CIRCLE:
                return new Circle(randomNumber.nextInt(MAX - MIN + 1), figureColor);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(figureColor, randomNumber.nextInt(MAX - MIN + 1),
                        randomNumber.nextInt(MAX - MIN + 1), randomNumber.nextInt(MAX - MIN + 1));
            case SQUARE:
                return new Square(randomNumber.nextInt(MAX - MIN + 1), figureColor);
            case RECTANGLE:
                return new Rectangle(randomNumber.nextInt(MAX - MIN + 1),
                        randomNumber.nextInt(MAX - MIN + 1), figureColor);
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomNumber.nextInt(100),
                        randomNumber.nextInt(MAX - MIN + 1),
                        randomNumber.nextInt(MAX - MIN + 1), figureColor);
            default:
                return new Circle(10, Color.WHITE.name());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
