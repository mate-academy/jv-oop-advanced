package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    
    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    public double getCountSquare() {
        return sideA * sideB;
    }
    
    @Override
    public void draw() {
        String rectanglePrint =
                "Figure: rectangle, area: " + getCountSquare() + " sq.units, sideA: " + sideA
                        + " units, sideB: " + sideB + " units, color: " + getColor();
        System.out.println(rectanglePrint);
    }
}
