package org.example;


     class outterClass{
         int age = 23;
          class innerClass{
             String name = "kajela";
         }
        }
    class Main {
         public static void main(String[] args) {
             outterClass myObj = new outterClass();
             outterClass.innerClass myObj1 = myObj.new innerClass();
        System.out.println(myObj1.name + myObj.age);
    }
}