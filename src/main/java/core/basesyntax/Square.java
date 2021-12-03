package core.basesyntax;

public class Square extends Figure {
    private double side;
    private double area;
    private Colors color;

    public Square() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.side = Math.random();
        this.color = colorSupplier.getRandomColor();
        this.area = side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square:");
        System.out.println(" side: " + side
                + " color: " + color
                + " area: " + area);
    }
}
