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

public class Gradebook {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Class> classes = new ArrayList<Class>();

    public static void main(String[] args) {

        Input input = new Input();
        input.setVisible(true);

    }

    public static double studentAverage() {

        double sum = 0;

        for (int i = 0; i < classes.size(); i++) {
            sum += classes.get(i).getGrade();
        }

        return (sum * 100) / (classes.size());
    }

}
