package com.freeroom.ReplaceTypeCodeWithClass;

/**
 * Created by IntelliJ IDEA.
 * User: lly
 * Date: 10/30/11
 * Time: 9:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private EmployeeType _type;

    public Employee(EmployeeType type) {
        _type = type;
    }

    public EmployeeType getType() {
        return _type;
    }
}
