package core.basesyntax.model;

public class RightTriangle extends Figure {
    private final int hypotenuse;
    private final int biggerCathetus;
    private final int smallerCathetus;

    public RightTriangle(int hypotenuse, int biggerCathetus, int smallerCathetus, Color color) {
        super((biggerCathetus * smallerCathetus) / 2, color);
        this.hypotenuse = hypotenuse;
        this.biggerCathetus = biggerCathetus;
        this.smallerCathetus = smallerCathetus;
    }

    @Override
    public String draw() {
        return new StringBuilder("Right triangle: ")
                .append("area = ")
                .append(this.getArea())
                .append(", hypotenuse length = ")
                .append(this.hypotenuse)
                .append(", cathetus = ")
                .append("{")
                .append(biggerCathetus)
                .append(", ")
                .append(smallerCathetus)
                .append("}")
                .append(", color = ")
                .append(this.getColor())
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
}
