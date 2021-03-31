package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA (int sideA) {
        this.sideA = sideA;
    }
    public int getSideA(){
        return sideA;
    }

    public void setSideB (int sideB) {
        this.sideB = sideB;
    }
    public int getSideB(){
        return sideB;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + sideA * sideB
                + " sq. units, sides length: " + sideA + ", " + sideB
                + "color: " + super.getColor());
    }

    public void area() {
        System.out.println("Area: " + sideA * sideB);
    }
}
