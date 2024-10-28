package core.basesyntax;

public class Square extends FigureTwo implements AreaOfFigure,InfoFigure {
    //квадрат

    public Square(String color, double firstSide) {
        super(color, firstSide, firstSide);
    }

    @Override
    public double detAreaOfFigure() {
        return getSecondSide() * getFirstSide();
    }

    @Override
    public String infoFigure() {
        return ("FirsSide : " + getFirstSide() + " см"
                + " SecondSide : " + getSecondSide() + " см"
                + " Area = " + detAreaOfFigure());
    }

    @Override
    public String infoFromFigure() {
        return ("Square: "
                + "FirsSide: " + getFirstSide() + " см, "
                + "SecondSide: " + getSecondSide() + " см, "
                + "Area: " + detAreaOfFigure()) + " см, "
                + "Color: " + getColor();
    }
}
