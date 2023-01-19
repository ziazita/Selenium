package java.lang.example;

public class CoreJavaBrushUp {
    public static void main(String[] args){

        String s = "Rahul Shety Academy";
        String[] splittedString = s.split("Shety");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        //System.out.println(splittedString[2]);//
        System.out.println(splittedString[1].trim());
        for (int i=s.length()-1; 0<=i; i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}
