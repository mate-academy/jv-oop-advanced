package core.basesyntax;

import java.util.Random;
/*  -rand number
    -add switch case and number every number its figure
    -return figure
*

     figures:
     1.Circle
     2.Square
     3.Rectangle
     4.RightTriangle
     5.IsoscelesTrapezoid

* */


public class FigureSupplier extends ColorSupplier {

    public static Figure getRandomFigure() {
        int randNum = 1; //new Random().nextInt(5);
        Figure suplier;
        switch (randNum){
            case 1: suplier = new Circle(getRandomColor(), 1 + (100 - 1) * (new Random().nextDouble()));
                    return suplier;
            case 2: suplier = new Square(getRandomColor(),  1 + (100 - 1) * (new Random().nextDouble()));
                return suplier;
            case 3: suplier = new Rectangle(getRandomColor(),1 + (100 - 1) * (new Random().nextDouble()),1 + (100 - 1) * (new Random().nextDouble()));
                return suplier;
            case 4: suplier = new RightTriangle(getRandomColor(),1 + (100 - 1) * (new Random().nextDouble()),1 + (100 - 1) * (new Random().nextDouble()));
                return suplier;
            case 5: suplier = new IsoscelesTrapezoid(getRandomColor(),20); //new Random().nextDouble()
                return suplier;
            default: suplier = new Circle(getRandomColor(),0);
                    return suplier;


        }
    }
}
