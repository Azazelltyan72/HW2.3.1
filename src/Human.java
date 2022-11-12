import java.time.LocalDate;

public class Human {
    private String name;
    private String town;
    private int yearOfBirth;
    private String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    @Override
    public String toString() {
        return "Привет! " +
                "Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году." +
                " Я сейчас " + job +
                ". Будем знакомы!";
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }
}
