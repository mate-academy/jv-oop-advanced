package core.basesyntax;

import core.basesyntax.Figures.*;
import core.basesyntax.Suppliers.AreaSupplier;
import core.basesyntax.Suppliers.ColorSupplier;
import core.basesyntax.Suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figuresArray.length; i++) {
            Figure figure = new Figure();
            figure.setFigureName(new FigureSupplier().getRandomFigure());
            figure.setFigureColor(new ColorSupplier().getRandomColor());
            figure.setArea(new AreaSupplier().getRandomArea());
            figuresArray[i] = figure;
        }
        System.out.println("*---------------------------------*");
        for (Figure figure : figuresArray) {
            if (figure.getFigureName().equals("CIRCLE")) {
                Figure circle = new Circle();
                circle.setFigureName(figure.getFigureName());
                circle.setFigureColor(figure.getFigureColor());
                circle.setArea(figure.getFigureArea());
                System.out.println(circle.figureInfo());

                Figure defaultCircle = new Circle();
                defaultCircle.setFigureName(new FigureSupplier().getDefaultFigure());
                defaultCircle.setFigureColor(new ColorSupplier().getDefaultColor());
                defaultCircle.setArea(new AreaSupplier().getDefaultArea());
                System.out.println("\n" + "The next line is going to be a default circle:"
                        + "\n"
                        + defaultCircle.figureInfo()
                        + "\n");
            }
            if (figure.getFigureName().equals("SQUARE")) {
                Figure square = new Square();
                square.setFigureName(figure.getFigureName());
                square.setFigureColor(figure.getFigureColor());
                square.setArea(figure.getFigureArea());
                System.out.println(square.figureInfo());
            }
            if (figure.getFigureName().equals("RIGHT_TRIANGLE")) {
                Figure rightTriangle = new RightTriangle();
                rightTriangle.setFigureName(figure.getFigureName());
                rightTriangle.setFigureColor(figure.getFigureColor());
                System.out.println(rightTriangle.figureInfo());
            }
            if (figure.getFigureName().equals("RECTANGLE")) {
                Figure rectangle = new Rectangle();
                rectangle.setFigureName(figure.getFigureName());
                rectangle.setFigureColor(figure.getFigureColor());
                System.out.println(rectangle.figureInfo());
            }
            if (figure.getFigureName().equals("ISOSCELES_TRAPEZOID")) {
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setFigureName(figure.getFigureName());
                isoscelesTrapezoid.setFigureColor(figure.getFigureColor());
                System.out.println(isoscelesTrapezoid.figureInfo());
            }
            System.out.println("*---------------------------------*");
        }
    }
}
