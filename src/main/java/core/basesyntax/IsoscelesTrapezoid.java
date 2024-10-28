package core.basesyntax;

public class IsoscelesTrapezoid extends FigureTwo implements AreaOfFigure, InfoFigure {
    //равнобедренная трапеция
    private double height; // высота

    public IsoscelesTrapezoid(String color, double firsSide, double secondSide, double height) {
        super(color, firsSide, secondSide);
        this.height = height;
    }

    @Override
    public double detAreaOfFigure() {
        return ((getFirstSide() + getSecondSide()) / 2) * height;
    }

    @Override
    public String infoFigure() {
        return ("FirsSide = " + getFirstSide() + " см ,"
                + " SecondSide = " + getSecondSide() + " см , "
                + "Height = " + height + " см , "
                + " Area = " + detAreaOfFigure()) + " см";
    }

    @Override
    public String infoFromFigure() {
        return ("IsoscelesTrapezoid: "
                + "FirsSide: " + getFirstSide() + " см, "
                + "SecondSide: " + getSecondSide() + " см, "
                + "Height: " + height + " см, "
                + "Area: " + detAreaOfFigure()) + " см, "
                + "Color: " + getColor();
    }
}
