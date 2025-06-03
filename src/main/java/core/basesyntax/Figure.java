package core.basesyntax;

abstract class Figure implements Drawable, Measurable {
   private String color;

   Figure(String color) {
       this.color = color;
   }

    public String getColor() {
        return color;
    }
}
