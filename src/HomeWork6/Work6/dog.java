package HomeWork6.Work6;

public class dog extends animal {

    public dog(String name, String color, String animalSize, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, color, animalSize, age, maxRunDistance, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println(name + " Гав-Гав");
    }

    @Override
    public void moveSwim(int distance) {
        if (distance < maxSwimDistance) {
            System.out.println(name + " swimming " + distance + "m. Max distance:" + maxSwimDistance);
        } else {
            System.out.println(" The animal cannot swim this distance.");
        }
    }

}


