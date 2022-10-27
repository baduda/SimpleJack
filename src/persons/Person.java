package persons;

import java.util.Objects;

public class Person implements Comparable {
    private String name;
    protected int heights;
    String id;

    public static String country;

    public Person(String name, int heights) {
        this.name = name;
        this.heights = heights;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return p.heights - heights;
    }

    public String getName() {
        return name;
    }

    public int getHeights() {
        return heights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (heights != person.heights) return false;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + heights;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}

