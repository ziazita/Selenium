package java.lang.example;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {
    public static  void  main(String[] args) {

       // int[] arr2 = {1, 2, 4, 5, 6, 7, 9, 6, 5, 54, 66, 8, 9, 56, 99};
       // for (int i = 0; i < arr2.length; i++) {
      //      if (arr2[i] % 2 == 0) {
       //         System.out.println(arr2[i]);
       //         break;
       //     } else {
         //       System.out.println(arr2[i] + "- cislo je nedelitelne dvomi");
      //      }
        ArrayList<String> a = new ArrayList<String>();
        a.add("zita");
        a.add("selecka");
        a.add("selenium");
        a.add("academy");
        System.out.println(a.get(3));

        for (int i=0; i<a.size();i++)
        {

            System.out.println(a.get(i));
        }
       System.out.println("***********************");
        for (String val : a)
        {
            System.out.println(val);
        }
            System.out.println(a.contains("selenium"));


    }



        }




