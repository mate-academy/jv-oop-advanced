package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private static final int MAX_VALUE_PARAMETER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figures getRandomFigure(){
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index];
    }

    public Figure getRandomResult(){
        switch (getRandomFigure()){
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE_PARAMETER));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE_PARAMETER));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE_PARAMETER), random.nextInt(MAX_VALUE_PARAMETER));
            case RIGHTTRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE_PARAMETER), random.nextInt(MAX_VALUE_PARAMETER));
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE_PARAMETER), random.nextInt(MAX_VALUE_PARAMETER), random.nextInt(MAX_VALUE_PARAMETER));
        }
        return getRandomResult();
    }

    public Circle getDefaultFigure(){
        return new Circle("white",10);
    }
}
