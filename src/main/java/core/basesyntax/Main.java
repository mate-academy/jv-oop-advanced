package core.basesyntax;

import core.basesyntax.models.*;

public class Main {
    public static void main(String[] agrs) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println("Figure: " + getFigureName(figure)
                    + ", area: " + figure.getArea()
                    + " sq. units"
                    + getFigureDescription(figure)
                    + ", color: " + getColor(figure));
        }
    }

    private static String getFigureName(Figure figure) {
        if (figure instanceof Square) {
            return "square";
        } else if (figure instanceof Rectangle) {
            return "rectangle";
        } else if (figure instanceof RightTriangle) {
            return "triangle";
        } else if (figure instanceof Circle) {
            return "circle";
        } else if (figure instanceof IsoscelesTrapezoid) {
            return "trapezoid";
        } else {
            return "";
        }
    }

    private static String getFigureDescription(Figure figure) {
        if (figure instanceof Square) {
            return ", side: " + ((Square) figure).getSide() + " units";
        } else if (figure instanceof Rectangle) {
            return ", width: " + ((Rectangle) figure).getWidth()
                    + " units, height: " + ((Rectangle) figure).getHeight() + " units";
        } else if (figure instanceof RightTriangle) {
            return ", firstLeg: " + ((RightTriangle) figure).getFirstLeg()
                    + " units, secondLeg: " + ((RightTriangle) figure).getSecondLeg()
                    + " units";
        } else if (figure instanceof Circle) {
            return ", radius: " + ((Circle) figure).getRadius() + " units";
        } else if (figure instanceof IsoscelesTrapezoid) {
            return ", height: " + ((IsoscelesTrapezoid) figure).getHeight()
                    + " units, firstBase: " + ((IsoscelesTrapezoid) figure).getFirstBase()
                    + " units, secondBase: "
                    + ((IsoscelesTrapezoid) figure).getSecondBase() + " units";
        } else {
            return "";
        }
    }

    private static String getColor(Figure figure) {
        if (figure instanceof Square) {
            return ((Square) figure).getColor();
        } else if (figure instanceof Rectangle) {
            return ((Rectangle) figure).getColor();
        } else if (figure instanceof RightTriangle) {
            return ((RightTriangle) figure).getColor();
        } else if (figure instanceof Circle) {
            return ((Circle) figure).getColor();
        } else if (figure instanceof IsoscelesTrapezoid) {
            return ((IsoscelesTrapezoid) figure).getColor();
        } else {
            return "";
        }
    }
}
