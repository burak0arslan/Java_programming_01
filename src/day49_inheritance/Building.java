package day49_inheritance;

import jdk.jshell.PersistentSnippet;

public class Building {
    public static void main(String[] args) {

        Student person1 = new Student();
        person1.name = "Berkcan";
        person1.age=19;
        person1.favoriteHobby = "Going to gym";
        person1.talk();

        person1.study(); // this was a method made in child class
        person1.FunLevel=5;

        Student obj2 = new Student();
        obj2.name="Jorge";
        obj2.age=18;
        obj2.favoriteHobby = "drawing";
        obj2.talk();
        //the above variables and methods were inherited from the Person class


        obj2.FunLevel = 100;
        obj2.study();
    }
}
