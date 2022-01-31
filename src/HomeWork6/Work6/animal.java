package HomeWork6.Work6;

public abstract class animal {

        protected String name;
        private String color;
        private String animalSize;
        private int age;
        private int maxRunDistance;
        protected int maxSwimDistance;

        public animal(String name, String color, String animalSize, int age, int maxRunDistance, int maxSwimDistance) {
            this.name = name;
            this.color = color;
            this.animalSize = animalSize;
            this.age = age;
            this.maxRunDistance = maxRunDistance;
            this.maxSwimDistance = maxSwimDistance;
        }

        public String getAllInformation(){
            return this.name + " -name. Color: " +
                    this.color + ". Size: " +
                    this.animalSize + ". Age: " +
                    this.age + ". MaxRunDistance: " +
                    this.maxRunDistance + " m. and MaxSwimDistance: " +
                    this.maxSwimDistance + " m.";
        }

        public abstract void voice();

        public void moveRun (int distance) {
            if (distance < maxRunDistance) {
                System.out.println(name + " running " + distance + "m. Max distance:" + maxRunDistance);
            } else {
                System.out.println(" The animal cannot run this distance ");
            }
        }

        public abstract void moveSwim (int distance);

    }
