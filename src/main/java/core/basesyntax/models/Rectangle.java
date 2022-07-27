package core.basesyntax.models;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return getSideA() * getSideB();
    }

    @Override
    public String printInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: rectangle, side a - ")
                .append(getSideA())
                .append(" units, side b - ")
                .append(getSideB())
                .append(" units, color - ")
                .append(getColor())
                .append(", area - ")
                .append(area())
                .append(" sq.units");
        return info.toString();
    }
}
