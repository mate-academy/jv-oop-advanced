package core.basesyntax;

import core.basesyntax.figures.*;
import java.util.Random;
public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_LENGTHS = 15;
    private static final int CONST_RADIUS = 10;
    private Random random = new Random();
    private ColourSupplier colourSupplier = new ColourSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 1 :
                return new Rectangle(colourSupplier.getRandomColour(), random.nextInt(MAX_LENGTHS)
                        , random.nextInt(MAX_LENGTHS));
            case 2:
                return  new RightTriangle(colourSupplier.getRandomColour(), random.nextInt(MAX_LENGTHS),
                        random.nextInt(MAX_LENGTHS));
            case 3:
                return new Circle(colourSupplier.getRandomColour(), random.nextInt(MAX_LENGTHS));
            case 4:
                return new IsoscelesTrapezoid(colourSupplier.getRandomColour(),
                        random.nextInt(MAX_LENGTHS), random.nextInt(MAX_LENGTHS), random.nextInt(MAX_LENGTHS));
            default:
                return new Square(colourSupplier.getRandomColour(),
                        random.nextInt(MAX_LENGTHS));
        }
    }

    public Figure getDefaultFigure(){
        return new Circle( Colours.WHITE.name().toLowerCase(), CONST_RADIUS);
    }
}
