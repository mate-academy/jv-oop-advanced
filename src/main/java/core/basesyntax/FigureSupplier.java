package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        //adding bound: 1000 to avoid wrong area and to leave clarity code
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = {
                new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),//Color
                        random.nextInt(1000),//upperSide
                        random.nextInt(1000),//downSide
                        random.nextInt(1000)//height
                ),
                new Circle(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(1000)//radius
                ),
                new RightTriangle(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(1000),//firstLeg
                        random.nextInt(1000)//secondLeg
                ),
                new Rectangle(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(1000),//sideA
                        random.nextInt(1000)//sideB
                ),
                new Square(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(1000)//side
                )};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), 10);
    }
}
