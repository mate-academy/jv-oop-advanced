package core.basesyntax;

public class Rectangle extends Figure {

    int sideA;
    int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName() + ", area: "
                +  getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + color);
    }
}
