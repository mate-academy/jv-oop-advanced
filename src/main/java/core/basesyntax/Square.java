package core.basesyntax;

public class Square extends FigureTwo implements AreaOfFigure,InfoFigure {
    //квадрат

    public Square(String color, double firsSide) {
        super(color, firsSide, firsSide);
    }

    @Override
    public double detAreaOfFigure() {
        return getSecondSide() * getFirsSide();
    }

    @Override
    public String infoFigure() {
        return ("Длина : " + getFirsSide() + " см"
                + " Ширина : " + getSecondSide() + " см"
                + " Площадь квадрата = " + detAreaOfFigure());
    }

    @Override
    public String infoFromRigure() {
        return ("Квадрат: " + "Длина: " + getFirsSide() + " см, "
                + "Ширина: " + getSecondSide() + " см, "
                + "Площадь квадрата: " + detAreaOfFigure()) + " см, "
                + "Цвет: " + getColor();
    }
}
