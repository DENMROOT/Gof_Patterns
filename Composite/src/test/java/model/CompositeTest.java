package model;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class CompositeTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    OrgUnit company;
    OrgUnit department_1;
    OrgUnit department_2;
    OrgUnit department_3;

    @Before
    public void init(){
        company = new OrgUnitImpl("Test company");

        department_1 = new OrgUnitImpl("department 1");
        department_2 = new OrgUnitImpl("department 2");
        department_3 = new OrgUnitImpl("department 3");

        company.addChild(department_1);
        company.addChild(department_2);
        company.addChild(department_3);

        OrgUnit employee_1 = new OrgElementImpl("Employee_1");
        OrgUnit employee_2 = new OrgElementImpl("Employee_2");

        department_1.addChild(employee_1);
        department_1.addChild(employee_2);

        OrgUnit employee_3 = new OrgElementImpl("Employee_3");
        department_2.addChild(employee_3);

        OrgUnit employee_4 = new OrgElementImpl("Employee_4");
        OrgUnit employee_5 = new OrgElementImpl("Employee_5");
        OrgUnit employee_6 = new OrgElementImpl("Employee_6");
        department_3.addChild(employee_4);
        department_3.addChild(employee_5);
        department_3.addChild(employee_6);
    }

    @Test
    public void CompositeTest(){
        company.generateOverallDescr();

        assertEquals("Test company" + System.lineSeparator() +
                "department 1" + System.lineSeparator() +
                "Employee_1" + System.lineSeparator() +
                "Employee_2" + System.lineSeparator() +
                "department 2" + System.lineSeparator() +
                "Employee_3" + System.lineSeparator() +
                "department 3" + System.lineSeparator() +
                "Employee_4" + System.lineSeparator() +
                "Employee_5" + System.lineSeparator() +
                "Employee_6" + System.lineSeparator(), log.getLog());
    }

    @Test
    public void CompositeRemoveElementTest(){
        company.removeChild(department_2);
        company.generateOverallDescr();

        assertEquals("Test company" + System.lineSeparator() +
                "department 1" + System.lineSeparator() +
                "Employee_1" + System.lineSeparator() +
                "Employee_2" + System.lineSeparator() +
                "department 3" + System.lineSeparator() +
                "Employee_4" + System.lineSeparator() +
                "Employee_5" + System.lineSeparator() +
                "Employee_6" + System.lineSeparator(), log.getLog());
    }
}
