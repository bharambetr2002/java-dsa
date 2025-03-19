/* 
Classes nd objects
classes are the group of entities. Collection of similar properties.
objects are the entities in the real world.
blueprint is the class
and the object derived from blueprint is object

classes contains attributes(prioerties) and also some functions(behanvior)

access modifiers - shared data

private - within class only
default - within class and package
protected - within class, within package, outside package by sub class only
public - within class, within package outside package by subclass only, outside package

getters and setters are functions created with object

get: to retun the value
set: to modify the value

this keyword is used to refer to the curretc value

Encapsulation - 
Encapsulation is defined as the wrapping up of data & methods under a single unit. It aslo implements data hiding. 

Constructors: constructor is a special method which is involked automaticaly at the time of object creation.

 type of costructor - 
 parametarised
 non-parametarised
 copy constructor
  
 */

public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a
        p1.setColor("blue");
        p1.setTip(5);
    }
}

class Pen {
    // prop and function
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;

    }

}

class Student {
    String name;
    int age;
    float percentage;
}