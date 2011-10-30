package com.freeroom.ReplaceTypeCodeWithSubclasses;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by IntelliJ IDEA.
 * User: lly
 * Date: 10/30/11
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyTest2 {

    @Test
    public void should_get_employee_type_given_an_engineer() {
        Employee employee = new Employee(Employee.ENGINEER);
        assertThat(employee.getTypeCode(), is(Employee.ENGINEER));
    }
}
