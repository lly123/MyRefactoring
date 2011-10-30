package com.freeroom.ReplaceTypeCodeWithSubclasses;

/**
 * Created by IntelliJ IDEA.
 * User: lly
 * Date: 10/30/11
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
class Engineer extends Employee {

    public Engineer() {
        super(Employee.ENGINEER);
    }

    public int getTypeCode() {
        return Employee.ENGINEER;
    }
}
