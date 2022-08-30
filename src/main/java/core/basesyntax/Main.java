package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.RandomFigure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figuresupplier.SupplierFigure;

public class Main {
    public static void main(String[] args) {

        InformationFigures random1 = new RandomFigure();
        InformationFigures random2 = new RandomFigure();
        InformationFigures random3 = new RandomFigure();
        InformationFigures circle = new Circle("Circle", "Red", 21);
        InformationFigures rectangle = new Rectangle("Rectangle", "Blue", 21, 20);
        InformationFigures square = new Square("Square", "Yellow", 21);
        SupplierFigure supplierFigure = new SupplierFigure();

        InformationFigures[] figure = new InformationFigures[]{random1, random2, random3, circle, rectangle, square};
        supplierFigure.getDefaultFigure();
        for (InformationFigures figures : figure) {
            figures.infoFigure();
        }
    }
}
