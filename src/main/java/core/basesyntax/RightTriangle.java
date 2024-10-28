package core.basesyntax;

public class RightTriangle extends FigureTwo implements AreaOfFigure, InfoFigure {
    //прямоугольный треугольник
    private double height; // высота

    public RightTriangle(String color, double firsSide, double height) {
        super(color, firsSide, height);
    }

    @Override
    public double detAreaOfFigure() {
        return (getFirsSide() * height) / 2;
    }

    @Override
    public String infoFigure() {
        return ("Высота = " + height + "см ,"
                + "Ширина = " + getSecondSide() + "см ,"
                + "Площадь треугольника = " + detAreaOfFigure()) + "см";
    }

    @Override
    public String infoFromRigure() {
        return ("Треугольник: "
                + "Длина: " + getFirsSide() + " см, "
                + "Высота: " + height + " см, "
                + "Площадь треугольника: " + detAreaOfFigure()) + " см, "
                + "Цвет: " + getColor();
    }
}
