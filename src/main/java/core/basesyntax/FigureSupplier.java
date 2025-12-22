package core.basesyntax;

import java.util.Random;

public class FigureSupplier{
    private final Random rand = new Random();

    public Figure getRandomFigure(String color){
        int figureType = rand.nextInt(5) + 1;
        switch (figureType){
            case 1: return new Circle(rand.nextInt(20) + 1, color);
            case 2: return new Square(rand.nextInt(20) + 1, color);
            case 3: return new Rectangle(rand.nextInt(20) + 1, rand.nextInt(20) + 1, color);
            case 4: return new RightTriangle(rand.nextInt(20) + 1, rand.nextInt(20) + 1, color);
            case 5: return new IsoscelesTrapezoid(rand.nextInt(20) + 1, rand.nextInt(20) + 1, color);
            default: return null;
        }
    }
}