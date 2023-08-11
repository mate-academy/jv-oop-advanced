package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure(){
        return new Circle(colorSupplier.getRandomColor(), 10.0);
    }

    public Figure getRandomFigure(){
        switch (random.nextInt(5)){
            case 0:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        getSide(),
                        getSide()
                );
            case 1:
                return new Square(
                        colorSupplier.getRandomColor(),
                        getSide()
                );
            case 2:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        getSide()
                );
            case 3:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        getSide(),
                        getSide(),
                        getSide()
                );
            case 4:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        getSide(),
                        getSide(),
                        getSide()
                );
        }
        return null;
    }
    
    private double getSide(){
        return random.nextDouble() * 10;
    }

}
