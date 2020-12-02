package core.basesyntax;

import java.util.Random;

public class FiguresGenerator {
    private static final int COUNT_OF_FIGURES = 5;
    
    private Random random = new Random();
    
    public Figure[] generateFiguresArray() {
        Figure[] figures = new Figure[random.nextInt(100)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = generateFigure();
        }
        return figures;
    }
    
    private Figure generateFigure() {
        switch (random.nextInt(COUNT_OF_FIGURES)) {
            default:
            case 0:
                return new Square(generateSide(), generateColor());
            case 1:
                return new Rectangle(generateSide(), generateSide(), generateColor());
            case 2:
                return new Circle(generateSide(), generateColor());
            case 3:
                return new RightTriangle(generateSide(), generateSide(), generateColor());
            case 4:
                return new IsoscelesTrapezoid(generateSide(), generateSide(), generateSide(),
                        generateColor());
        }
    }
    
    private Color generateColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
    
    private double generateSide() {
        return random.nextDouble() + random.nextInt(100);
    }
}
