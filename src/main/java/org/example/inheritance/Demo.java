package org.example.inheritance;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Reksio", 10, 4);
        Cat cat = new Cat("Łukasz", 3, "white");
        Cat cat2 = new Cat();
        Fish fish = new Fish();

        System.out.println(dog);
        dog.bark();
        dog.doTricks();
        dog.teachDogNewTrick("sit");
        dog.teachDogNewTrick("give hand");
        dog.teachDogNewTrick("play dead");
        dog.teachDogNewTrick("bark on command");
        dog.doTricks();
        dog.eatSomething();

        System.out.println(dog);

        System.out.println("---------");
        cat.meow();
        cat.distractTheOwner();
        cat.eatSomething();
        fish.doSomeSwimming();
        System.out.println("---------");
        AnimalKeeper animalKeeper = new AnimalKeeper();
//        animalKeeper.feedDog(dog);
//        animalKeeper.feedCat(cat);
        animalKeeper.feed(cat);
        animalKeeper.feed(dog);
        animalKeeper.feed(fish);
        System.out.println("---------");
        animalKeeper.makeThemMove(fish);
        animalKeeper.makeThemMove(cat);
        animalKeeper.makeThemMove(dog);

        System.out.println("---------");
//        Animal animal = new Dog();
//        Cat cat1 = (Cat) animal;
//        cat1.meow();

        System.out.println("----------");
        //polymorphism example
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
        animal = new Fish("Rybka", 15, "Shark");
        animal.move();

        System.out.println(fish);



    }
}
