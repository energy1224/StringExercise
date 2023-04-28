import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularStatement {
    public static void main(String[] args) {
//        String s = "Пример не очен длинной строки";
//
//        int num1 = s.indexOf("очень");
//
//        System.out.println("слово очень в исходной строке на позиции " + num1);
//
//        String[] mas = s.split("о");
//        System.out.println(Arrays.toString(mas));
//        String[] mas2 = s.split(" ");
//        System.out.println(Arrays.toString(mas2));
//        char[] chars = s.toCharArray();
//        System.out.println(Arrays.toString(chars));
//
//        String[] mas3 = s.split("оо|ее|нн|сс|лл|бб|мм");
//        System.out.println(mas3[0]);
//        System.out.println(mas3[1]);
//
//        int num2 = mas3[0].length();
//
//        System.out.println("удвоенная буква на позиции " + num2);

         exemple2();
    }

public static void exemple2()
    {
        String fname = "in.txt";
        try {
            Scanner sc = new Scanner(new File(fname));
            String s = sc.nextLine();
            System.out.println(s);
           // из строки в массив
            String[] peopleStr = s.split("}");

            for (String personStr: peopleStr ) {
                System.out.println(personStr);
            }
             for (int i =0; i< peopleStr.length;i++ ) {
                peopleStr[i]= peopleStr[i].replaceAll("[^a-zA-Z : 0-9]", "");
                 System.out.println(peopleStr[i]);
             }



            Person[] massiv = new Person[peopleStr.length];
            int k=0;
            for (String personStr: peopleStr ) {
                // из массива в массив
                String[] pair = personStr.split(": ");
                System.out.println(pair[0]+","+pair[1]);
                String name = pair[0];
                int point = Integer.parseInt(pair[1]);
                massiv[k] = new Person(name, point);
                k++;
            }

            for (Person p: massiv  ) {
                System.out.println(p.name + " получает "+p.points);
            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}


class Person {
    String name;
    int points;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    public Person(String name, int points) {
        this.name = name;
        this.points = points;
    }
}

