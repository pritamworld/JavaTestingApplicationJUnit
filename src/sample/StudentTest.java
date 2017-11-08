package sample;

import junit.framework.TestCase;
import org.junit.Test;

public class StudentTest extends TestCase {
    Student s;
    public StudentTest(String testName) {
        super(testName);
        s = new Student();
    }

    protected void setUp() throws Exception {
        super.setUp();
        s.setStudentData(1,"Pritesh",new int[]{10,20,30,40,50});

    }

    protected void tearDown() throws Exception {
        super.tearDown();

    }

    public void testCorrectTotal() {

        System.out.println("Correct total test");
        System.out.println(s.toString());
        assertEquals(150, s.getTotal());

    }

    public void testWrongTotal() {
        System.out.println("Wrong total test");
        //s.setMarks(new int[]{10,20,30,40,50});
        System.out.println(s.toString());
        assertNotSame(120, s.getTotal());
    }

    public void testName() {
        System.out.println("Name test");
        assertEquals("Pritesh", s.getStudentName());
    }

    public void testTypical() {      // test a typical value in partitions
        assertEquals("wrong grade", 'A',  s.getGrade());
        assertEquals("wrong grade", 'B',  s.getGrade());
        assertEquals("wrong grade", 'C',  s.getGrade());
        assertEquals("wrong grade", 'F',  s.getGrade());
    }

    public void testGrade() {   // test the boundaries of the partitions
        assertEquals("wrong grade", 'A',  s.getGrade());
        assertEquals("wrong grade", 'A',  s.getGrade());
        assertEquals("wrong grade", 'B',  s.getGrade());
        assertEquals("wrong grade", 'B',  s.getGrade());
        assertEquals("wrong grade", 'C',  s.getGrade());
        assertEquals("wrong grade", 'C',  s.getGrade());
        assertEquals("wrong grade", 'F',  s.getGrade());
        assertEquals("wrong grade", 'F',  s.getGrade());
    }
}
