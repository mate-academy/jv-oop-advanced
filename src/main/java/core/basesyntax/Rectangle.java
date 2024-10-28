package core.basesyntax;

public class Rectangle extends FigureTwo implements AreaOfFigure, InfoFigure {
    //прямоугольник

    public Rectangle(String color,double firsSide, double secondSide) {
        super(color, firsSide, secondSide);
    }

    @Override
    public double detAreaOfFigure() {
        return getFirstSide() * getSecondSide();
    }

    @Override
    public String infoFigure() {
        return ("Длина = " + getFirstSide()
                + " Ширина = " + getSecondSide()
                + " Area = " + detAreaOfFigure());
    }

    @Override
    public String infoFromFigure() {
        return ("Rectangle: "
                + "FirsSide: " + getFirstSide() + " см, "
                + "SecondSide: " + getSecondSide() + " см , "
                + "Area: " + detAreaOfFigure()) + " см, "
                + "Color: " + getColor();
    }
}
