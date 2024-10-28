package core.basesyntax;

public class RightTriangle extends FigureTwo implements AreaOfFigure, InfoFigure {
    //прямоугольный треугольник
    private double height; // высота

    public RightTriangle(String color, double firsSide, double height) {
        super(color, firsSide, height);
    }

    @Override
    public double detAreaOfFigure() {
        return (getFirstSide() * height) / 2;
    }

    @Override
    public String infoFigure() {
        return ("Height = " + height + "см ,"
                + "FirsSide = " + getSecondSide() + "см ,"
                + "Area = " + detAreaOfFigure()) + "см";
    }

    @Override
    public String infoFromFigure() {
        return ("RightTriangle: "
                + "FirsSide: " + getFirstSide() + " см, "
                + "Height: " + height + " см, "
                + "Area: " + detAreaOfFigure()) + " см, "
                + "Color: " + getColor();
    }
}
