package core.basesyntax;

public class FigureSupplier extends ColorSupplier {
    public static final int Max_Size = 10;
    public Figure getRandomFigure() { 
    ColorSupplier color = new ColorSupplier();
    String randomColor = color.getRandomColor();
    int randomed = new Random().nextInt(5);
    switch (randomed) {
        case 0 :
            return new Square(new Random().nextDouble() * Max_Size + 1, new Random().nextDouble() * Max_Size + 1, randomColor);
        case 1 :
            return new Rectangle(new Random().nextDouble() * Max_Size + 1, new Random().nextDouble() * Max_Size + 1, randomColor);
        case 2 :
            return new RightTriangle(new Random().nextDouble() * Max_Size + 1, new Random().nextDouble() * Max_Size + 1, randomColor);
        case 3 :
            return new IsoscelesTrapezoid(new Random().nextDouble() * Max_Size + 1,new Random().nextDouble() * Max_Size + 1, new Random().nextDouble() * Max_Size + 1, randomColor);
        default :
            return new Circle(new Random().nextDouble() * Max_Size + 1, randomColor); 
    }
}
     public Figure getDefaultFigure() {
        return new Circle(10,"white");
     }
}
