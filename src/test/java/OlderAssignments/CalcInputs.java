package OlderAssignments;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class CalcInputs {

    @Test
     void print() {
       Scanner scan = new Scanner(System.in);
       double value1 = scan.nextDouble();
       double value2 = scan.nextDouble();
        Calculation add = new Calculation();
        Calculation subt = new Calculation();
        Calculation mult = new Calculation();
        Calculation div = new Calculation();


        add.setValue1(value1);
        add.setValue2(value2);
        assertEquals(4,add.Addition());

        subt.setValue1(value1);
        subt.setValue2(value2);
        assertEquals(0,subt.Subtraction());

        mult.setValue1(value1);
        mult.setValue2(value2);
        assertEquals(4,mult.Multiplication());

        div.setValue1(value1);
        div.setValue2(value2);
        assertEquals(1,div.Division());
    }
}
