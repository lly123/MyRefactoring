package com.freeroom.ReplaceTypeCodeWithSubclasses;

/**
 * Created by IntelliJ IDEA.
 * User: lly
 * Date: 10/30/11
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
class Employee {
    public static final int ENGINEER = 0;
    private int _type;

    public Employee(int type) {
        _type = type;
    }

    public static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Employee(ENGINEER);
        }
        throw new IllegalArgumentException("Type is invalid.");
    }

    public int getTypeCode() {
        return _type;
    }
}
