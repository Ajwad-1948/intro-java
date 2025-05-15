public class PersonHeight {
    double height;

    // Method to set height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to display height
    public void showHeight() {
        System.out.println("Height: " + height + " meters");
    }

    public static void main(String[] args) {
    PersonHeight person = new PersonHeight();
    person.setHeight(5.7);
    person.showHeight();

    }
}
