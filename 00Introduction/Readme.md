
# Introduction to Learning Java

Download and Install JDK,
[JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

Download the latest one.
Java SE Development Kit 15 - Downloads
[Download Link](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)

Install installer or any required and then install it into your system with default systems.

In windows, it is installed in,
C:\Program Files\Java.
Java development tools are available in C:\Program Files\Java\jdk-15.0.1\bin .

To test the setup of Java,  go to cmd, and type “javac” or “javac -version”.

If not setup, go to cmd,
C:\Program Files\Java\jdk-15.0.1\bin>

Then type “javac” or “javac -versions”.
So, we have to set up a path to the environmental variables.
Type “path” in cmd.

> set path = C:\Program Files\Java\jdk-15.0.1\bin;  # if this much, all paths will be erased.
> set path = C:\Program Files\Java\jdk-15.0.1\bin; %path%;
> path

Path is a global variable, every application is runned if set up in path.

Above process is temporary.

For global setup, go to this PC,Properties, Advanced System Settings, environment variables, then path, edit, check, if not present ,
then

C:\Program Files\Java\jdk-15.0.1\bin this path.

First Program, create a file in notepad,

import java.lang.*;

class Myfirst
{

    public static void main(String arg[])
{
System.out.println(“Hello World”);
}
}

Saved it as “Myfirst.java” in the required directory.

Go to that directory using cmd.

~~
javac Myfirst.java
java Myfirst
~~
Skeleton of Java Program
Myfirst.java

~~
import java.lang.*;
// lang is a basic package and mandatory.

// everything is in class in java. Classname should be the same as file name.
class Myfirst
{
public static void main(String arg[])
// main is the main method, return type is void.
// Public makes it public inside class.
// jvm calls the main method with help of static.
// (String arg[])  is command line arguments. String is a class.
{
System.out.println(“Hello World”); // Prints String
// println is a method
// System is a class
}
}
~~
For compilations,
> javac Myfirst.java

This gives Myfirst.java, a bytecode file without error.

For running,

> java Myfirst

If file name and class name are different, for running the code, class name should be identified to run.

When class is declared as public, filename and class name should be the same.

Input in Java
Class scanner is used which is in the util package(from java version 5 onwards).

/?CODE

~~
import java.lang.*;
import java.util.*;
class TwoSum
{
public static void main(String argos[])
{
Scanner s = new Scanner(System.in);
int a,b,c;
System.out.println(“Enter two numbers: :);
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println(“Sum is “+c);
}
}
~~

Class Scanner common methods:
nextInt() → for integer
nextFloat() → for floating numbers
nextDouble() → for Double
next() → for single String
nextLine() → for multiple line strings

Others are:
nextByte()
nextShort()
nextLong()
nextBoolean()

hasNextInt()
hasNextFloat()

How to find methods of any class?
~~
>javap java.[package].[class]
> javap java.util.Scanner
~~
