package bean;

public class Person {
    private String name;
    private Integer age;
    private String nationality;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getAge() != null ? !getAge().equals(person.getAge()) : person.getAge() != null) return false;
        return getNationality() != null ? getNationality().equals(person.getNationality()) : person.getNationality() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        result = 31 * result + (getNationality() != null ? getNationality().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
