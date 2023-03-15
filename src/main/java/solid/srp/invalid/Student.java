package solid.srp.invalid;

public class Student implements Comparable {
    private String id;
    private String name;
    private String major;

    @Override
    public int compareTo(Object o) {
        Student compare = (Student) o;

        return this.name.compareTo(compare.name);
    }
}
