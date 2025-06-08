package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract static class Figure implements Drawable {
        private String color;

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public abstract double getArea();
    }
}
