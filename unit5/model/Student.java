package unit5.model;

import unit5.model.APeople;

public class Student extends APeople {
    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student "+ super.toString();
    }
}
