package core.basesyntax;

public class Rectangle implements Figure {
    private double width;
    private double height;

    @Override 
    public double getArea() {
        return width * height;
    }

    @Override 
    public void draw() {
        System.out.println("Width - " + width 
                            + "Height - " + height
        );
    }
}
