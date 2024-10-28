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
        return ((getFirsSide() + getSecondSide()) / 2) * height;
    }

    @Override
    public String infoFigure() {
        return ("Длина = " + getFirsSide() + " см ,"
                + " Ширина = " + getSecondSide() + " см , "
                + "Высота = " + height + " см , "
                + " Площадь трапеция = " + detAreaOfFigure()) + " см";
    }

    @Override
    public String infoFromRigure() {
        return ("Трапеция: "
                + "Длина: " + getFirsSide() + " см, "
                + "Ширина: " + getSecondSide() + " см, "
                + "Высота: " + height + " см, "
                + "Площадь трапеция: " + detAreaOfFigure()) + " см, "
                + "Цвет: " + getColor();
    }
}
