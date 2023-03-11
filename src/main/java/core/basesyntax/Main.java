package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int random = new Random().nextInt(5);
//        int randomNumberForMassive1 = new FigureSupplier().randomForMassive();
//        int randomNumberForMassive2 = new FigureSupplier().randomForMassive();
//        int randomNumberForMassive3 = new FigureSupplier().randomForMassive();
//        Figure figure1 = new FigureSupplier().getRandomFigure(randomNumberForMassive1);
//        Figure figure2 = new FigureSupplier().getRandomFigure(randomNumberForMassive2);
//        Figure figure3 = new FigureSupplier().getRandomFigure(randomNumberForMassive3);
//        Figure defaultFigure1 = new FigureSupplier().getDefaultFigure();
//        Figure defaultFigure2 = new FigureSupplier().getDefaultFigure();
//        Figure defaultFigure3 = new FigureSupplier().getDefaultFigure();
//        Figure[] figures = {figure1,figure2,figure3,defaultFigure1,defaultFigure2,defaultFigure3};
//
//        System.out.println(Arrays.toString(figures));
//
//        Circle circle = new Circle(10,"white");
//        circle.draw();
//        Square square = new Square(new int[] {3});
//        square.draw();

        figureSupplier.getRandomFigure(random);
    }
}
