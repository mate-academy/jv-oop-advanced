package core.basesyntax;

public class Square extends Figures implements Drawable {
    private int hight;

    public Square(Colors color, int area, int hight) {
        super(color, area);
        this.hight = hight;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public void draw() {
        System.out.println("Square has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: square, area: "
                + getArea() + " sq. units, hight: "
                + getHight() + " units, color: " + getColor().toLowerCase();

    }
}
