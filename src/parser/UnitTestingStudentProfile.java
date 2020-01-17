package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Student student = new Student("Hassan", "Bhuiyan", "Silver", "100");

        try{//method getFirst name
            Assert.assertEquals(student.getFirstName(),"Hassan");
            System.out.println("Test Passed getFirstName");
        }catch ( AssertionError as){
            System.out.println("Test Failed getFirstName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try{//method last name
            Assert.assertEquals(student.getLastName(),"Bhuiyan");
            System.out.println("Test passed lastName");
        }catch (AssertionError as){
            System.out.println("Test Failed lastName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try{//method get id
            Assert.assertEquals(student.getId(),"100");
            System.out.println("Test passed getId");
        }catch (AssertionError as){
            System.out.println("Test Failed getId");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try{//method get score
            Assert.assertEquals(student.getScore(),"Silver");
            System.out.println("Test passed getScore");
        }catch (AssertionError as){
            System.out.println("Test Failed getScore");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try{//method toString
            Assert.assertEquals(student.toString(),"Student(id= 100)Hassan Bhuiyan  Grade = Silver");
            System.out.println("Test passed toString");
        }catch (AssertionError as){
            System.out.println("Test Failed toString");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }
    }
}
