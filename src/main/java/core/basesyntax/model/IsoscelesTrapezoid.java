package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double litLenght;
    private double bigLenght;

    public IsoscelesTrapezoid(String color, double height, double litLenght, double bigLenght) {
        super(color);
        this.height = height;
        this.litLenght = litLenght;
        this.bigLenght = bigLenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLitLenght() {
        return litLenght;
    }

    public void setLitLenght(double litLenght) {
        this.litLenght = litLenght;
    }

    public double getBigLenght() {
        return bigLenght;
    }

    public void setBigLenght(double bigLenght) {
        this.bigLenght = bigLenght;
    }

    @Override
    public double getArea() {
        return height * (0.5 * (litLenght * bigLenght));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, color: " + getColor() + ", height: " + getHeight() + ", litLenght: "
                + getLitLenght() + ", bigLenght: " + getBigLenght());
    }
}
