package unit5.model;

import unit5.model.APeople;

public class Teacher extends APeople {
    public Teacher() {
        super();
    }

    @Override
    public String toString() {
        return "Teacher "+ super.toString();
    }
}
