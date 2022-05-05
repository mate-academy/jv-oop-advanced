package core.basesyntax;

public class Square extends Figure {
    public Square(String color, double sideA) {
        super(color);
    }

    @Override
    public double getAreaCalculator() {
        return getSideA() * getSideA();
    }

    @Override
    public String getDrawable() {

        return "Figure : square "
                + ", area: " + getAreaCalculator() + "sq.units, side: "
                + getSideA() + "units, color: " + getColor();
    }
}




