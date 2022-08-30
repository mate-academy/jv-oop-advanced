package core.basesyntax;

import core.basesyntax.figureAll.Circle;
import core.basesyntax.figureAll.RandomFigure;
import core.basesyntax.figureAll.Rectangle;
import core.basesyntax.figureAll.Square;
import core.basesyntax.figureSupplier.SupplierFigure;

public class Main {
    public static void main(String[] args) {

         FigureOptions random1 = new RandomFigure();
         FigureOptions random2= new RandomFigure();
         FigureOptions random3 = new RandomFigure();
         FigureOptions circle = new Circle("Circle","Red",21);
         FigureOptions rectangle = new Rectangle("Rectangle","Blue",21,20);
         FigureOptions square = new Square("Square","Yellow",21);

         FigureOptions [] figure = new FigureOptions[] {random1, random2, random3, circle, rectangle, square};
         SupplierFigure.getDefaultFigure();
         for (FigureOptions figures : figure){
             figures.infoFigure();
         }

    }
}
