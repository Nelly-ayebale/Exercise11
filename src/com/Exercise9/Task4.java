package com.Exercise9;

enum Shape {
       square,rectangle,circle,trapezoid,rhombus,triangle,oval,hexagon
    }
    public class Task4{
        public static void main(String[] args) {
          for(Shape sh: Shape.values())
              System.out.println(sh + "-" + sh.ordinal());
        }
    }

