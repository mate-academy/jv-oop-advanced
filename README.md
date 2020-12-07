# jv-oop-advanced

__Solve the task using OOP principles__

Task:
1. There are some figures of the following types: square, rectangle, right triangle, circle, isosceles trapezoid.
1. All figures have: `state` - each figure has color and unique property, `behaviour` - we can obtain figures' area and draw it.
   Think where you will declare each functional: top level class / interface / bottom level class.  
P.S
`draw` - means print figure and all its' properties in the console using System.out.println()  
1. We need to generate an array of figures with random parameters, number of objects in the array is also unknown.
For this purpose create two more classes (`ColorProducer` - for generating random color and `FigureProducer` - for generating figure with random properties)
1. After generating the array, we need to display the entire list of objects that we have, for example:

```
 Figure: square, area: 25 sq. units, side length: 5 units, color: blue
 Figure: triangle, area: 12.5 sq. units, hypotenuse: 7.1 units, color: yellow
```


#### [Try to avoid these common mistakes, while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/abstract-class-interface/oop-advanced)
