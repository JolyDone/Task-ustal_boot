package web.model;

public class Car {
    private String name;
    private int year;
    private String score;

    public Car(String name, int year, String score) {
        this.name = name;
        this.year = year;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", score='" + score + '\'' +
                '}';
    }
}

