package Matching;
import Output.Output;
import Input.Input;
import GetInfo.*;
public class Matching {
    public static int again = 0;
    public static void main(String[] args) {
        Output.greeting();
        while(again != 1) {
            int who = Input.isStudent();
            InfoPeople.info(who);
        }
        Output.goodBye();
    }

}