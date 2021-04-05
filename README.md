# jv-oop-advanced

__Solve the task using OOP principles__

Task:

There are some figures of the following types: square, rectangle, right triangle, circle, isosceles trapezoid.

All figures have 
- **state** (all figures have `color`, but each figure type can also have one or several unique properties (`radius` for circle, `firstLeg` and `secondLeg` for right triangle, and so on).
- **behaviour** - we can obtain the area of any figure and are able to draw it. To 'draw' means to print out all information about a figure using `System.out.println()`. 
   
Think where you should declare these fields and methods: top level class / interface / bottom level classes.  

We need to generate an array of figures with random parameters, number of objects in the array is also unknown.
For this purpose create two more classes:
- `ColorSupplier` with `public String getRandomColor()` method - for generating random color, 
- and `FigureSupplier` with `public Figure getRandomFigure()` method - for generating figure with random properties.

After generating the array, we need to display the entire list of objects that we have, for example:

```
 Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
 Figure: triangle, area: 12.5 sq.units, firstLeg: 7 units, secondLeg: 5 units, color: yellow
```

#### [Try to avoid these common mistakes, while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/abstract-class-interface/oop-advanced)
