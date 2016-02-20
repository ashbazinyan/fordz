
import java.util.Arrays;
import java.util.Scanner;

public class Pordzer {
    static String advice(String str)
    {
        String monthString="";
        switch (str)
        {
            case "01": monthString = "January taq  hagnvir";
                return monthString ;
            case "02": monthString = "February is winter month,taq  hagnvir";
                return monthString ;
            case "03": monthString = "March is  warm,shat  taq  mi  hagnvir";
                return monthString ;
            case "04": monthString = "April is warm,shat  taq  mi  hagnvir";
                return monthString ;
            case "05": monthString = "May tetev  hagnvir";
                return monthString ;
            case "06": monthString = "June tetev  hagnvir";
                return monthString ;
            case "07": monthString = "July tetev  hagnvir";
                return monthString ;
            case "08": monthString = "August is hot.tetev  hagnvir ";
                return monthString ;
            case "09": monthString = "September is warm.shat  taq  mi  hagnvir";
                return monthString ;
            case "10": monthString = "October is cold.taq hagnvir";
                return monthString ;
            case "11": monthString = "Novamber is cold.taq hagnvir";
                return monthString ;
            case "12": monthString = "Desamber is cold.taq hagnvir";
                return monthString ;
        }
        return "sxal  mutqagrum  eq  katarel";
    }
    public  static void main(String[] args)
    {
        System.out.println("Enter date in DD-MM-YYYY");
        Scanner date=new Scanner(System.in);
        String data1=date.nextLine();
        System.out.println(advice(data1.substring(3, 5)));
    }
}
