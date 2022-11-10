package core.basesyntax;

public class Figure implements getAble,drawAble {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

   public String getColor() {
       return color;
        }
        public void setColor (String color) {
       this.color = color;
        }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
