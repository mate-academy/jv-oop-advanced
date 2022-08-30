package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.RandomFigure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figuresupplier.SupplierFigure;
import core.basesyntax.figures.Square;
public class Main {
    public static void main(String[] args) {
        
         AreaCalculator random1 = new RandomFigure();
         AreaCalculator random2 = new RandomFigure();
         AreaCalculator random3 = new RandomFigure();
         AreaCalculator circle = new Circle("Circle","Red",21);
         AreaCalculator rectangle = new Rectangle("Rectangle","Blue",21,20);
         AreaCalculator square = new Square("Square","Yellow",21);
         SupplierFigure supplierFigure = new SupplierFigure();

         AreaCalculator[] figure = new AreaCalculator[] {random1, random2, random3,
                 circle, rectangle, square};
         supplierFigure.getDefaultFigure();
         for (AreaCalculator figures : figure){
             figures.infoFigure();
         }
    }
}
