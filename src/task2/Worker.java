package task2;

public class Worker {

    private String surname;
    private String post;
    private String year;

    public Worker(String surname, String post, String year) {
        this.surname = surname;
        this.post = post;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Фамилия: " + this.surname + "\n" + "Должность: " + this.post + "\n" + "Стаж: " + this.year;
    }
}
