package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arrfigure = new Figure[6];
        for (int i = 0; i < 3; i++) {
            arrfigure[i] = FigureSupplier.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            arrfigure[i] = FigureSupplier.getDefaultFigure();
        }
        for (Figure figures : arrfigure) {
            StringBuilder line = new StringBuilder();
            if (figures.getClass() == Square.class) {
                line.append("Figure: square, area: ")
                        .append(String.format("%(.1f", ((Square) figures).getArea()))
                        .append(" sq.units, side: ")
                        .append(((Square) figures).getA())
                        .append(" units, color: ")
                        .append(figures.getColor());
            }
            if (figures.getClass() == Rectangle.class) {
                line.append("Figure: rectangle, area: ")
                        .append(String.format("%(.1f", ((Rectangle) figures).getArea()))
                        .append(" sq.units, side a: ")
                        .append(((Rectangle) figures).getA())
                        .append(" units, side b: ")
                        .append(((Rectangle) figures).getB())
                        .append(" units, color: ")
                        .append(figures.getColor());
            }
            if (figures.getClass() == RightTriangle.class) {
                line.append("Figure: triangle, area: ")
                        .append(String.format("%(.1f", ((RightTriangle) figures).getArea()))
                        .append(" sq.units, firstLeg: ")
                        .append(((RightTriangle) figures).getFirstLeg())
                        .append(" units, secondLeg: ")
                        .append(((RightTriangle) figures).getSecondLeg())
                        .append(" units, color: ")
                        .append(figures.getColor());
            }
            if (figures.getClass() == Circle.class) {
                line.append("Figure: circle, area: ")
                        .append(String.format("%(.1f", ((Circle) figures).getArea()))
                        .append(" sq.units, radius: ")
                        .append(((Circle) figures).getRadius())
                        .append(" units, color: ")
                        .append(figures.getColor());
            }
            if (figures.getClass() == IsoscelesTrapezoid.class) {
                line.append("Figure: trapesoid, area: ")
                        .append(String.format("%(.1f", ((IsoscelesTrapezoid) figures).getArea()))
                        .append(" sq.units, a: ")
                        .append(((IsoscelesTrapezoid) figures).getA())
                        .append(" units, b: ")
                        .append(((IsoscelesTrapezoid) figures).getB())
                        .append(" units, c: ")
                        .append(((IsoscelesTrapezoid) figures).getC())
                        .append(" units, color: ")
                        .append(figures.getColor());
            }
            System.out.println(line.toString());
        }
    }
}
