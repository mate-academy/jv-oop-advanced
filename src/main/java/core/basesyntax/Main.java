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
        for (Figure figure: arrfigure) {
            StringBuilder line = new StringBuilder();
            if (figure.getClass() == Square.class) {
                line.append("Figure: square, area: ")
                        .append(String.format("%(.1f", figure.getArea()))
                        .append(" sq.units, side: ")
                        .append(((Square) figure).getA())
                        .append(" units, color: ")
                        .append(figure.getColor());
            }
            if (figure.getClass() == Rectangle.class) {
                line.append("Figure: rectangle, area: ")
                        .append(String.format("%(.1f", figure.getArea()))
                        .append(" sq.units, side a: ")
                        .append(((Rectangle) figure).getA())
                        .append(" units, side b: ")
                        .append(((Rectangle) figure).getB())
                        .append(" units, color: ")
                        .append(figure.getColor());
            }
            if (figure.getClass() == RightTriangle.class) {
                line.append("Figure: triangle, area: ")
                        .append(String.format("%(.1f", figure.getArea()))
                        .append(" sq.units, firstLeg: ")
                        .append(((RightTriangle) figure).getFirstLeg())
                        .append(" units, secondLeg: ")
                        .append(((RightTriangle) figure).getSecondLeg())
                        .append(" units, color: ")
                        .append(figure.getColor());
            }
            if (figure.getClass() == Circle.class) {
                line.append("Figure: circle, area: ")
                        .append(String.format("%(.1f", figure.getArea()))
                        .append(" sq.units, radius: ")
                        .append(((Circle) figure).getRadius())
                        .append(" units, color: ")
                        .append(figure.getColor());
            }
            if (figure.getClass() == IsoscelesTrapezoid.class) {
                line.append("Figure: trapesoid, area: ")
                        .append(String.format("%(.1f", figure.getArea()))
                        .append(" sq.units, a: ")
                        .append(((IsoscelesTrapezoid) figure).getA())
                        .append(" units, b: ")
                        .append(((IsoscelesTrapezoid) figure).getB())
                        .append(" units, c: ")
                        .append(((IsoscelesTrapezoid) figure).getC())
                        .append(" units, color: ")
                        .append(figure.getColor());
            }
            System.out.println(line.toString());
        }
    }
}
