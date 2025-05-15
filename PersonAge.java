public class PersonAge {
    int age;

    // Method to set age
    public void setAge(int age ) {
        this.age = age;
    }

    // Method to display age
    public void showAge() {
        System.out.println("Age: " + age + " years");

    }

    public static void main(String[] args) {
        PersonAge person = new PersonAge();
        person.setAge(12);
        person.showAge();
    }
}
