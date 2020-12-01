package core.basesyntax;

public class RightTriangle extends Figures implements Drawable{
    private int hypotenuse;

    public RightTriangle(Colors color, int area, int hypotenuse) {
        super(color, area);
        this.hypotenuse = hypotenuse;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle has been drawn");
    }
    @Override
    public String toString() {
        return "Shape: right triangle, area: "
                + getArea() + " sq. units, hypotenuse: "
                + getHypotenuse() + " units, color: " + getColor().toLowerCase();
    }
}

// multiply of cathetus