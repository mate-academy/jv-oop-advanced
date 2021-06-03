package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

import java.util.Random;


/**
 * Feel free to remove this class and create your own.
 */
public class Main extends FigureSupplier {
    public static void main(String[] args) {

   Figure[] figures = new Figure[5];
   for (int i = 0; i < figures.length; i++) {
       figures[i] = getRandomFigure();
       figures[i].draw();
   }



    }

}
