public class Person {
    private String _name;
    private int _age;
    private String _phone;
    private String _email;


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        if (_age < 16) {
            throw new IllegalArgumentException("Age cannot be less than 16");
        }
        if (_age > 80) {
            throw new IllegalArgumentException("Age cannot be greater than 80");
        }

        this._age = _age;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }


    // Methods
    // print
    public void print() {
        System.out.println("Name: " + this._name);
        System.out.println("Age: " + this._age);
        System.out.println("Phone: " + this._phone);
        System.out.println("Email: " + this._email);
    }
}
