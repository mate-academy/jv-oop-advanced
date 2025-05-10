package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    
    private Figure getRandomCircle() {
        String color = new ColorSupplier().getRandomColor();
        int randomRadius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(randomRadius, color);
    }
    
    private Figure getRandomIsoscelesTrapezoid() {
        String color = new ColorSupplier().getRandomColor();
        int randomTopSide = random.nextInt(MAX_RANDOM_NUMBER);
        int randomBottomSide = random.nextInt(MAX_RANDOM_NUMBER);
        int randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(randomTopSide, randomBottomSide, randomHeight, color);
    }
    
    private Figure getRandomRectangle() {
        String color = new ColorSupplier().getRandomColor();
        int randomSideA = random.nextInt(MAX_RANDOM_NUMBER);
        int randomSideB = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(randomSideA, randomSideB, color);
    }
    
    private Figure getRandomRightTriangle() {
        String color = new ColorSupplier().getRandomColor();
        int randomFirstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        int randomSecondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(randomFirstLeg, randomSecondLeg, color);
    }
    
    private Figure getRandomSquare() {
        String color = new ColorSupplier().getRandomColor();
        int randomSides = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(randomSides, color);
    }
    
    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_COUNT);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
