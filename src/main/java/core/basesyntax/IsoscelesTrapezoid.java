package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int basis1;
    private int basis2;
    public int getHeight() {return height; }
    public void setHeight(int height) {this.height = height; }
    public int getBasis1() {return basis1; }
    public void setBasis1(int basis) {this.basis1 = basis1; }
    public int getBasis2() {return basis2; }
    public void setBasis2(int basis2) {this.basis2 = basis2; }
    @Override
    public double getArea() {
        return (basis1 + basis2) / 2 * height;
    }
}
