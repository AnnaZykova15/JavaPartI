package Home5.HomeWork5;

public class Work5 {

    public static void main(String[] args){
        employee[] office = {
                new employee("Ivanov", "Ivan", "Ivanovich", "manager", "ivanovii@mail.ru", "=79991111111", 50000, 35),
                new employee("Petrov", "Petr", "Petrovich", "manager", "petrovpp@mail.ru", "+79992222222", 50000, 41),
                new employee("Nikolaeva", "Natalya", "Nikolaevna", "manager", "nikolaevann@mail.ru", "=79993333333", 50000, 37),
                new employee("Belova", "Galina", "Stepanovna", "accountant", "belovags@mail.ru", "=79994444444", 45000, 55),
                new employee("Chernov", "Sergey", "Sergeevich", "director", "directorchernov@mail.ru", "+79999999911", 500000, 47)
        };
        showEmployeeInfo(office);
        System.out.println("Employees older than 40:");
        showOldEmployee(office);
    }

    public static void showEmployeeInfo(employee[] emp ) {
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getAllInformation());
        }
    }

    public static void showOldEmployee(employee[] office){
        for(int i = 0; i< office.length; i++){
            if(office[i].getAge() >40){
                System.out.println(office[i].getAllInformation());
            }
        }
    }
}

