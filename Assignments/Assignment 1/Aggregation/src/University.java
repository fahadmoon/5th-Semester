
class University {
    private Department[] departments;
    private int departmentCount;

    public University(int maxDepartments) {
        departments = new Department[maxDepartments];
        departmentCount = 0;
    }

    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments. The university is at full capacity.");
        }
    }

    public void displayDepartments() {
        System.out.println("Riphah International University Departments:");
        for (int i = 0; i < departmentCount; i++) {
            System.out.println(departments[i].getName());
        }
    }
}
