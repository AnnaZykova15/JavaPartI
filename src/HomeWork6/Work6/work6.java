package HomeWork6.Work6;


import java.awt.desktop.ScreenSleepEvent;

public class work6 {

    public static void main(String[] args) {
        animal[] animals = {
                new cat("Murka", "White", "Small", 3, 200, 0),
                new dog("Bobik", "Black", "Big", 5, 500, 10),
        };
        showAnimalsInf(animals);
        animals[0].moveRun(100);
        animals[1].moveRun(300);
        animals[0].voice();
        animals[0].moveSwim(100);

        countAnimals(animals);
    }

    public static void countAnimals(animal[] animals){
        int animalsCount = 0;
        int catsCount = 0;
        int dogsCount = 0;

        for (int i = 0; i < animals.length; i++) {
            animalsCount++;
            if (animals[i] instanceof cat){
                catsCount++;
            }
            else{
                dogsCount++;
            }
        }

        System.out.println("Total animals: " + animalsCount);
        System.out.println("Total dogs: " + dogsCount);
        System.out.println("Total cats " + catsCount);
    }

    public static void showAnimalsInf(animal[] animals){
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getAllInformation());
        }
    }


}
