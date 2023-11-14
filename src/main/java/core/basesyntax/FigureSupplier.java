package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;

    public FigureSupplier(){
        this.colorSupplier=new ColorSupplier();
    }


    public Figure getRandomFigure() {
        Random random = new Random();
        int randomType = random.nextInt(5);
        int randomMax = random.nextInt(Integer.MAX_VALUE);
        String randomColor = colorSupplier.getRandomColor();

            switch (randomType) {
                case 0:
                    return new Circle(randomMax,randomColor);
                case 1:
                    return new Square(randomMax,randomColor);
                case 2:
                    return new Rectangle(randomMax,randomMax,randomColor);
                case 3:
                    return new RightTriangle(randomMax,randomMax,randomColor);
                case 4:
                    return new IsoscelesTrapezoid(randomMax,randomMax,randomMax,randomColor);
                default:
                    throw new IllegalStateException("Unexpected value: ");
            }
        }





    public Figure getDefaultFigure() {
       return new Circle(10,Color.WHITE.name());
    }
}