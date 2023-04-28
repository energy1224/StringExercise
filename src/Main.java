import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fname = "input.txt";
        String fname1 = "output.txt";

        try {
            Scanner sc = new Scanner(new File(fname));
            String s = sc.next();
            String douleLetter ="aa";
            int res = 0;
            int n = s.length()-douleLetter.length();
            for(int i=0; i<n; i++){
                String substr = s.substring(i, i+douleLetter.length());
                if (substr.equals(douleLetter))
                    res++;
            }

            Writer wr = new FileWriter(fname1);
            wr.write(String.valueOf(res));
            wr.close();



        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("File is not writen");;
        }



    }
}