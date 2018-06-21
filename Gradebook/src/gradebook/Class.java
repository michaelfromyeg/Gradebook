/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

/**
 *
 * @author mdema
 */
import java.util.ArrayList;

public class Class {

    private String myClassName;
    private String myTeacherName;
    private int myBlock;
    private char myDay;

    ArrayList<Test> tests = new ArrayList<Test>();

    public Class(String className, String teacherName, int block, char day) {

        myClassName = className;
        myTeacherName = teacherName;
        myBlock = block;
        myDay = day;

    }

    public String getClassName() {

        return this.myClassName;

    }

    public void setClassName(String newClassName) {

        this.myClassName = newClassName;

    }

    public String getTeacherName() {

        return this.myTeacherName;

    }

    public void setTeacherName(String newTeacherName) {

        this.myTeacherName = newTeacherName;

    }

    public int getBlock() {

        return this.myBlock;

    }

    public void setBlock(int newBlock) {

        this.myBlock = newBlock;

    }

    public char getDay() {

        return this.myDay;

    }

    public void setDay(char newDay) {

        this.myDay = newDay;

    }

    public void deleteClass(Class myClass) {

        myClass = null;

    }

    public void giveMeTheGoodNews() {

        System.out.print("I mean, C's get degreees.");

    }

    public void newAssesment(Class aClass, String name, double grade, double weighting) {

        Test myTest = new Test(aClass, name, grade, weighting);
        tests.add(myTest);

    }

    public void deleteAssesment(int index) {

        tests.remove(index);

    }

    public double gradeTotal() {

        double sum = 0;

        for (int i = 0; i < tests.size(); i++) {
            sum += tests.get(i).getGrade();
        }

        return sum;

    }

    public double getGrade() {

        double sum = 0;

        for (int i = 0; i < tests.size(); i++) {

            sum += tests.get(i).getCalculation();

        }

        return sum;

    }

    public double weightTotal() {

        double weightTotal = 0;

        for (int i = 0; i < this.tests.size(); i++) {

            weightTotal += this.tests.get(i).getWeighting();

        }

        return weightTotal;
    }

    public double classAverage() {

        double sum = 0;

        for (int i = 0; i < this.tests.size(); i++) {
            sum += this.tests.get(i).getCalculation();
        }

        return sum * 100;
    }

    public Test selectTest(int index) {

        return tests.get(index);

    }

    public boolean userAlert(Class classChoice) {

        double sum = 0;

        for (int i = 0; i < classChoice.tests.size(); i++) {
            sum += classChoice.tests.get(i).getWeighting();
        }

        if (sum < 1) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return this.getClassName() + " taught by " + this.getTeacherName();
    }

}
