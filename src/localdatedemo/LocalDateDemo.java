/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localdatedemo;
import java.time.*;
/**
 *
 * @author Omolemo
 */
public class LocalDateDemo {

    
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate graduationDate = LocalDate.of(2018,5,29);
        System.out.println("Today is " + today);
        System.out.println("Graduation is " + graduationDate);
    }
    
}
