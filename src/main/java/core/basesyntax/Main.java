package core.basesyntax;

import java.util.Arrays;

public class Main{
   public static void main(String[] args) {
      FigureSupplier figureSupplier = new FigureSupplier();
      figureSupplier.getRandomFigure().draw();
      figureSupplier.getRandomFigure().draw();

   }
}
