package core.basesyntax;

public class Square extends FigureSupplier {
    private int side;
    private String color;

    public Square() {
        this.side = 4;
        this.color = "green";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Name: square, " + "side: " + side + ", area: "
                + getArea() + ", color: " + color);
    }
}
