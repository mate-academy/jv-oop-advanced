package core.basesyntax;

public class Circle extends Figure implements AreaOfFigure, InfoFigure {
    //круг
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double detAreaOfFigure() {
        return Math.round(Math.PI * getRadius() * getRadius());
    }

    @Override
    public String infoFigure() {
        return ("Радиус2 = " + radius + '\n'
                + "Площадь круга = " + detAreaOfFigure());
    }

    @Override
    public String infoFromRigure() { // работает
        return ("Круг: "
                + "Радиус: " + radius + " см, "
                + "Площадь круга: " + detAreaOfFigure()) + " см, "
                + "Цвет круга: " + getColor();
    }

}
