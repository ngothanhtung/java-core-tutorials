public class Teacher extends Person {
    private String _skills;
    private double _salary;

    public String get_skills() {
        return _skills;
    }

    public void set_skills(String _skills) {
        this._skills = _skills;
    }

    public double get_salary() {
        return _salary;
    }

    public void set_salary(double _salary) {
        if (_salary < 0) {
            throw new IllegalArgumentException("Salary cannot be less than 0");
        }
        if (_salary > 100000000) {
            throw new IllegalArgumentException("Salary cannot be greater than 100000000");
        }
        this._salary = _salary;
    }

    public void print() {
        super.print();
        System.out.println("Skills: " + this._skills);
        System.out.format("Salary: %.2f\n", this._salary);
    }
}
