package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    public Figure getRandomFigure(ColorSupplier colorSupplier) {
        int figureType = random.nextInt(5); // Случайный выбор типа фигуры
        switch (figureType) {
            case 0:
                return new Circle(random.nextInt(10) + 1, colorSupplier);
            case 1:
                return new Square(random.nextInt(10) + 1, colorSupplier);
            case 2:
                return new RightTriangle(random.nextInt(10) + 1, random.nextInt(10) + 1, colorSupplier);
            case 3:
                return new IsoscelesTrapezoid(random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1, colorSupplier);
            case 4:
                return new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1, colorSupplier);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure(ColorSupplier colorSupplier) {
        return new Circle(10, new ColorSupplier() {
            @Override
            public String getRandomColor() {
                return "white";
            }
        });
    }
}




    /*   private final Random random = new Random();
    int sideA = random.nextInt(50);
    int sideB = random.nextInt(50);
    int sideC = random.nextInt(50);firstLeg and secondLeg
    public Figure getRandomFigure(int sideA ,int sideB ,int sideC){
        return
    } */