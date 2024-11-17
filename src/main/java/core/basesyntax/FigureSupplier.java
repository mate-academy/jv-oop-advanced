package core.basesyntax;

public class FigureSupplier extends ColorSupplier {
    public static final int Max_Size = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10; 
    private final Random random = new Random();
    public Figure getRandomFigure() { 
    ColorSupplier color = new ColorSupplier();
    String randomColor = color.getRandomColor();
    int randomed = new Random().nextInt(5);
    switch (randomed) {
            case 0:
                double squareSide = random.nextDouble() * MAX_SIZE + 1;
                return new Square(squareSide, color);
            case 1:
                double rectangleWidth = random.nextDouble() * MAX_SIZE + 1;
                double rectangleHeight = random.nextDouble() * MAX_SIZE + 1;
                return new Rectangle(rectangleWidth, rectangleHeight, color);
            case 2: 
                double firstLeg = random.nextDouble() * MAX_SIZE + 1;
                double secondLeg = random.nextDouble() * MAX_SIZE + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3: 
                double base1 = random.nextDouble() * MAX_SIZE + 1;
                double base2 = random.nextDouble() * MAX_SIZE + 1;
                double height = random.nextDouble() * MAX_SIZE + 1;
                return new IsoscelesTrapezoid(base1, base2, height, color);
            default: 
                double radius = random.nextDouble() * MAX_SIZE + 1;
                return new Circle(radius, color);
    }
}
     public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS,DEFAULT_COLOR);
     }
}
