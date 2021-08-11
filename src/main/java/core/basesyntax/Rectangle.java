package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA > 0 ? sideA : 0;
        this.sideB = sideB > 0 ? sideB : 0;
    }

    @Override
    public double getArea() {
        return this.getSideA() * this.getSideB();
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append(" Figure: rectangle, area: ")
                .append(this.getArea()).append(" sq.units, sideA: ")
                .append(this.getSideA()).append(" units, ")
                .append("sideB: ").append(this.getSideB()).append(" units, color: ")
                .append(this.getColor()).toString());
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
