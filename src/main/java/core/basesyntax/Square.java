package core.basesyntax;

public class Square implements Figure {
    private double side;

    @Override 
    public double getArea() {
        return side * side;
    }

    @Override 
    public void draw() {
        System.out.println("Side - " + side);
    }
}
