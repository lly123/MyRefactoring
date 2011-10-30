package com.freeroom.ReplaceTypeCodeWithSubclasses;

/**
 * Created by IntelliJ IDEA.
 * User: lly
 * Date: 10/30/11
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Employee {
    public static final int ENGINEER = 0;

    public static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
        }
        throw new IllegalArgumentException("Type is invalid.");
    }

    public abstract int getTypeCode();
}
