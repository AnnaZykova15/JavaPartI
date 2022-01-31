package Home5.HomeWork5;

public class employee {

    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public employee(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getAllInformation() {
        return this.surname + " " +
                this.name + " " +
                this.patronymic + ". Position: " +
                this.position + ". Email: " +
                this.email + ". Phone: " +
                this.phone + ". Salary: " +
                this.salary + " ru. Age: " +
                this.age + " years.";
    }

    }




