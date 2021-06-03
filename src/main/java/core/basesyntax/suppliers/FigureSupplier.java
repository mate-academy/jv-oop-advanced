package core.basesyntax.suppliers;

import core.basesyntax.*;
import core.basesyntax.suppliers.ColorSupplier;

import java.util.Random;



public class FigureSupplier extends ColorSupplier {

    public static Figure getRandomFigure() {
        int randNum = new Random().ints(1, 5).findFirst().getAsInt(); ;
        Figure suplier;
        switch (randNum){
            case 1: suplier = new Circle(getRandomColor(), randDouble());
                    return suplier;
            case 2: suplier = new Square(getRandomColor(), randDouble());
                return suplier;
            case 3: suplier = new Rectangle(getRandomColor(), randDouble(), randDouble());
                return suplier;
            case 4: suplier = new RightTriangle(getRandomColor(), randDouble(), randDouble());
                return suplier;
            case 5: suplier = new IsoscelesTrapezoid(getRandomColor(), randDouble(), randDouble(), randDouble(), randDouble());
                return suplier;
            default: suplier = new Square(getRandomColor(), randDouble());{
            };
                    return suplier;


        }
    }
    public static double randDouble() {
      return  1 + (100 - 1) * (new Random().nextDouble());
    }
}
