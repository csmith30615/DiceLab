# DiceLab

## Project Summary

This lab was meant to teach us how to construct classes and objects in Java. We were given a prompt to create a class (Die.java), which we must reference in order to create objects which we will reference later. In the main method (DiceLab.java), we had to create 5 Die objects with random sizes (from the list given in the class description), roll each Die, and print each Die in a format similar to "d8 = 6". This program could be used to create a simluation of Dungeons and Dragons, and the concepts in this code will help teach how objects are initialized and referrenced.

## Running the Program

This code was written in Java 1.7. 
\
\
In order to run, download the code and import it into a compiler (capable of compiling Java 1.7), compile it, and run it.

# DiceLab.java

### `public class DiceLab`

File meant to test whether the Die class is working properly or not. Creates a set of 5 Die of random sizes (4, 6, 8, 10, 12, 20, or 200), rolls them, and prints each Die's value

## Main

### `public static void main(String[] args)`

 * **Parameters:** `args` — the command line arguments
 
 
 
# Die.java

### `public class Die`

Creates a Die object with a specified number of faces

## Constructor

### `public Die(int faces)`

Die constructor with given number of faces

 * **Parameters:** `faces` — int amount of faces
 
 ## Methods

### `public int roll()`

Roll to randomize the int faceValue of the Die

 * **Returns:** int faceValue of the die

## Getters

### `public int getFaceValue()`

Gets the int faceValue of the Die

 * **Returns:** int faceValue of Die

### `public int getNumFaces()`

Gets the int faces of the Die

 * **Returns:** int faces, amount of faces on the die

### `@Override public String toString()`

Returns the string format of the Die's int faces and int faceValue

 * **Returns:** String of int faces and int faceValue
