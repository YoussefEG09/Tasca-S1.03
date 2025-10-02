package Level2_Tasca_S1_03;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant (String name, int score){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Invalid restaurant's name.");
        }
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant restaurant = (Restaurant) o;
        return name.equals(restaurant.name) && score == restaurant.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name , score);
    }

    @Override
    public String toString() {
        return "Restaurant " + name + '\'' +
                ", score = " + score + "/5" + "\n";
    }
}
