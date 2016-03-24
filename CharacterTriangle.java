import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.prism.shader.Solid_ImagePattern_Loader;

import  java.util.Scanner;
import java.net.SocketOption;
import java.net.SocketPermission;

/**
 * Created by Jasen on 19.3.2016 г..
 */
public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        for (int i = 0; i < first ; i++) {
            System.out.println();
            for (char ch = 97; ch < i + 98; ch++) {
                System.out.print(" "+ch);
            }

        }
        int num = first;
        for (int i = 0; i < num; i++) {
            System.out.println();
            first --;
            for (char ch = 97; ch < first + 97; ch++) {
                System.out.print(" "+ch);
                //first --;
            }

        }
    }
}

