package com.freeroom.ReplaceTypeCodeWithClass;

/**
 * Created by IntelliJ IDEA.
 * User: lly
 * Date: 10/30/11
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeType {

    public static EmployeeType ENGINEER = new EmployeeType(0);

    private int _type;

    public EmployeeType(int type) {
        _type = type;
    }

    public int getTypeCode() {
        return _type;
    }
}
