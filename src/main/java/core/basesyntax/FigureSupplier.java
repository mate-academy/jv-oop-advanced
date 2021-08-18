package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;

public class FigureSupplier {
    public Figure getRandomFigure() {
        String[] figures = {"Circle", "Square", "Rectangle", "RightTriangle", "IsoscelesTrapezoid"};
        String someFigure = figures[(int) (Math.random() * 4)];
        switch (someFigure) {
            case "Circle" :
                return new Circle();
            case "Square" :
                return new Square();
            case "Rectangle" :
                return new Rectangle();
            case "RightTriangle" :
                return new RightTriangle();
            case "IsoscelesTrapezoid" :
                return new IsoscelesTrapezoid();
            default:
                break;
        }
        return new Circle();
    }
}
