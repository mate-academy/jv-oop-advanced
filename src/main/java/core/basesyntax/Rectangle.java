package core.basesyntax;

public class Rectangle extends FigureTwo implements AreaOfFigure, InfoFigure {
    //прямоугольник

    public Rectangle(String color,double firsSide, double secondSide) {
        super(color, firsSide, secondSide);
    }

    @Override
    public double detAreaOfFigure() {
        return getFirsSide() * getSecondSide();
    }

    @Override
    public String infoFigure() {
        return ("Длина = " + getFirsSide()
                + " Ширина = " + getSecondSide()
                + " Площадь прямоугольника = " + detAreaOfFigure());
    }

    @Override
    public String infoFromRigure() {
        return ("Прямоугольник: " + "Длина: " + getFirsSide() + " см, "
                + "Ширина: " + getSecondSide() + " см , "
                + "Площадь прямоугольник: " + detAreaOfFigure()) + " см, "
                + "Цвет: " + getColor();
    }
}
