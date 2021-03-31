package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
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
        System.out.println("Figure: right triangle, area: " + (double)(sideB*sideA/2) + " sq. units, sides length: "
                + sideA + " " + sideB + "color: " + super.getColor());
    }

    public void area() {
        System.out.println("Area: "+ (double)(sideB*sideA/2));
    }
}
