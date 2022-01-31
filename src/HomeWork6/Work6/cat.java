package HomeWork6.Work6;

public class cat extends animal {

    public cat(String name, String color, String animalSize, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, color, animalSize, age, maxRunDistance, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println(name + " Мяу-Мяу");
    }

    @Override
    public void moveSwim(int distance) {
        System.out.println("Cat cannot swim!");
    }

    public void FurrFurr(){
        System.out.println("Furr Furr Furr... Furrrr");
    }
}