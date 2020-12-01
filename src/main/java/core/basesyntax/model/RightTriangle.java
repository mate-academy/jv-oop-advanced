package core.basesyntax.model;

public class RightTriangle extends Figure {

    private final int hypotenuse;
    private final int biggerCathetus;
    private final int smallerCathetus;

    public RightTriangle(int hypotenuse, int biggerCathetus, int smallerCathetus, Color color) {
        this.hypotenuse = hypotenuse;
        this.biggerCathetus = biggerCathetus;
        this.smallerCathetus = smallerCathetus;
        this.color = color;
        this.area = biggerCathetus * smallerCathetus / 2;
    }

    public RightTriangle() {
        this((int) (Math.random() * 20) + 1, 
                (int) (Math.random() * 12) + 1, 
                (int) (Math.random() * 9) + 1, 
                Color.randomColor());
    }

    @Override
    public String draw() {
        return new StringBuilder("Right triangle: ")
                .append("area = ")
                .append(this.area)
                .append(", hypotenuse length = ")
                .append(this.hypotenuse)
                .append(", cathetus = ")
                .append("{")
                .append(biggerCathetus)
                .append(", ")
                .append(smallerCathetus)
                .append("}")
                .append(", color = ")
                .append(this.color)
                .toString();
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public int getBiggerCathetus() {
        return biggerCathetus;
    }

    public int getSmallerCathetus() {
        return smallerCathetus;
    }

    public Color getColor() {
        return this.color;
    }
}
