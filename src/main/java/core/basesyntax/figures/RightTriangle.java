package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
        public double getFigureArea() {
        return (base * height) / 2; // скобки для читаемости
    }

    @Override
    public void figureDraw() {
        System.out.println("figure is: Right Triangle, "
                + "area is: " + getFigureArea() + " sq.units, "
                + "base is: " + base + " units, " + "heigth is: " + height + "units, "
                + "color is: " + getColor());
    }

}


