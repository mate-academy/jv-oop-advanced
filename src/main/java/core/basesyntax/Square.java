package core.basesyntax;

public class Square extends Figures {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
        this.area = side * side;
    }

    @Override
    public void displayInfo() {
        System.out.println("Shape: Square, area = " + area
                + " sq. units, side = " + side
                + " units, color = " + color.getCode()
                + "this" + color.reset());
    }

    @Override
    public void draw() {
        System.out.println("########");
        System.out.println("#      #");
        System.out.println("#      #");
        System.out.println("########");

    }
}
