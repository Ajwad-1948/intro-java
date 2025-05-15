public class PersonInfo {
    float height;
    boolean isStudent;
    char gender;

    // Method to set the information
    public void setInfo(float h, boolean s, char g) {
        height = h;
        isStudent = s;
        gender = g;
    }

    // Method to show the information
    public void showInfo() {
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        PersonInfo person = new PersonInfo();
        person.setInfo(1.65f, true, 'F');
        person.showInfo();
    }
}