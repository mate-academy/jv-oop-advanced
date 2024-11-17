package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIZE = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor().toString();
        int randomChoice = random.nextInt(5);
        switch (randomChoice) {
            case 0:
                double squareSide = random.nextDouble() * MAX_SIZE + 1;
                return new Square(squareSide, randomColor);
            case 1:
                double rectangleWidth = random.nextDouble() * MAX_SIZE + 1;
                double rectangleHeight = random.nextDouble() * MAX_SIZE + 1;
                return new Rectangle(rectangleWidth, rectangleHeight, randomColor);
            case 2:
                double firstLeg = random.nextDouble() * MAX_SIZE + 1;
                double secondLeg = random.nextDouble() * MAX_SIZE + 1;
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            case 3:
                double base1 = random.nextDouble() * MAX_SIZE + 1;
                double base2 = random.nextDouble() * MAX_SIZE + 1;
                double height = random.nextDouble() * MAX_SIZE + 1;
                return new IsoscelesTrapezoid(base1, base2, height, randomColor);
            default:
                double radius = random.nextDouble() * MAX_SIZE + 1;
                return new Circle(radius, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}

/*package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int MAX_SIZE = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10; 
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() { 
    String randomColor = colorSupplier.getRandomColor().toString();
    int randomed = new Random().nextInt(5);
    switch (randomed) {
            case 0:
                double squareSide = random.nextDouble() * MAX_SIZE + 1;
                return new Square(squareSide, randomColor);
            case 1:
                double rectangleWidth = random.nextDouble() * MAX_SIZE + 1;
                double rectangleHeight = random.nextDouble() * MAX_SIZE + 1;
                return new Rectangle(rectangleWidth, rectangleHeight, randomColor);
            case 2: 
                double firstLeg = random.nextDouble() * MAX_SIZE + 1;
                double secondLeg = random.nextDouble() * MAX_SIZE + 1;
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            case 3: 
                double base1 = random.nextDouble() * MAX_SIZE + 1;
                double base2 = random.nextDouble() * MAX_SIZE + 1;
                double height = random.nextDouble() * MAX_SIZE + 1;
                return new IsoscelesTrapezoid(base1, base2, height, randomColor);
            default: 
                double radius = random.nextDouble() * MAX_SIZE + 1;
                return new Circle(radius, randomColor);
    }
}
     public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS,DEFAULT_COLOR);
     }
}
*/