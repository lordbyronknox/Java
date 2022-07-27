package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();
        
        Pet p;
        //test cat with a cat reference.
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        //test cat with animal reference
        a = new Cat();
        a.eat();
        a.walk();
        //test cat with pet references
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();
        
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        
        a = new Fish();
        a.eat();
        a.walk();
        
        System.out.println("---------------------------");
        
        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
    }
    /*
    Determine whether the argument implements the Pet interface. If so, cast the
    reference to a Pet and invoke the play method. If not, print a message of "Danger!
    Wild Animal".
    */
    public static void playWithAnimal(Animal a) {
        if(a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        } else {
            System.out.println("Danger! Wild Animal");
        }
    }
    
}