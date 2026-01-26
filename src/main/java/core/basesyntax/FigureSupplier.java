package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(){
        int figure=random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (figure){
            case 0:
                return new Square(color, randomSide());
            case 1:
                return new Rectangle(color, randomSide(), randomSide());
            case 2:
                return new RightTriangle(color, randomSide(), randomSide());
            case 3:
                return new Circle(color, randomSide());
            default:
                return new IsoscelesTrapezoid(
                        color,
                        randomSide(),
                        randomSide(),
                        randomSide()
                );
        }
    }

    public Figure getDefaultFigure(){
        return new Circle("White",10);
    }

    private int randomSide(){
        return random.nextInt(10)+1;
    }
}
