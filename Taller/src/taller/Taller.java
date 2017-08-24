package taller;
import java.util.Scanner;
/**
  * 
  * @author Estudiante Mateo Pacheco (cpachecof@unal.edu.co) Esteban Muñoz (jemunozva@unal.edu.co)
 */
public class Taller {

    public static void main(String[] args) {
       
        Student estudiante = new Student("Jon Java", "jj@javauniv.edu");
        LibraryCard card1 = new LibraryCard(estudiante, 3);
        LibraryCard card2 = new LibraryCard(estudiante, 0);
        
        System.out.println(card1);
    }
    
}
