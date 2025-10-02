package Level1_Tasca_S1_03;

public class Month {
    private String name;

    public Month(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Invalid month's name.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return name.equals(month.name);
    }

 @Override
 public int hashCode() {
  return name.hashCode();
 }

 public String toString() {
        return name;
    }

}
