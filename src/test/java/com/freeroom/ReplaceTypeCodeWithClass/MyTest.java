package com.freeroom.ReplaceTypeCodeWithClass;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by IntelliJ IDEA.
 * User: lly
 * Date: 10/30/11
 * Time: 9:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyTest {

    @Test
    public void should_get_employee_type_given_a_employee() {
        Employee employee = new Employee(EmployeeType.ENGINEER);
        assertThat(employee.getType(), is(EmployeeType.ENGINEER));
    }
}
