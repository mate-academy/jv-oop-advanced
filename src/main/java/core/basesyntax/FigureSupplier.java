package core.basesyntax;

import core.basesyntax.concretefigures.*;

import java.util.Random;

public class FigureSupplier {

    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int MAX_PARAMETER_OF_FIGURE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(){

        int randomFigure = new Random().nextInt(AMOUNT_OF_FIGURES);

        switch (randomFigure) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomParameter());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomParameter(), getRandomParameter(), getRandomParameter());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomParameter(), getRandomParameter());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomParameter(), getRandomParameter());
            case 5:
                return new Square(colorSupplier.getRandomColor(), getRandomParameter());
            default:
                return getDefaultFigure();
        }

    }

    private int getRandomParameter(){
        return new Random().nextInt(MAX_PARAMETER_OF_FIGURE);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }
}
