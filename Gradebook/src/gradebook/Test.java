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
public class Test {

    private String myName;
    private double myGrade;
    private double myWeighting;
    private Class myClass;

    public Test(Class aClass, String name, double grade, double weighting) {

        myClass = aClass;
        myName = name;
        myGrade = grade;
        myWeighting = weighting;

    }

    public Class whatClass() { //getClass error???

        return this.myClass;

    }

    public void setClass(Class newClass) {

        this.myClass = newClass;

    }

    public double getGrade() {

        return this.myGrade;

    }

    public void setGrade(double newGrade) {

        this.myGrade = newGrade;

    }

    public String getGradeS() {

        return this.myGrade + "";

    }

    public String getName() {

        return this.myName;

    }

    public void setName(String newName) {

        this.myName = newName;

    }

    public double getWeighting() {

        return this.myWeighting;

    }

    public void setWeighting(double newWeighting) {

        this.myWeighting = newWeighting;

    }

    public String getWeightingS() {

        return this.myWeighting + "";

    }

    public double getCalculation() {

        return (this.getWeighting() / 100) * (this.getGrade() / 100);

    }

    public String getCalculationS() {

        return (this.getWeighting() / 100) * (this.getGrade() / 100) + "";

    }

    @Override
    public String toString() {

        return myName;

    }

}
