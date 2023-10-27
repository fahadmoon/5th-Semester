public class Main {
    public static void main(String[] args) {
        University myUniversity = new University(5);

        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        myUniversity.addDepartment(csDepartment);
        myUniversity.addDepartment(eeDepartment);

        myUniversity.displayDepartments();
    }
}
