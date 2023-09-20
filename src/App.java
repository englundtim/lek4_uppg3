import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv in ditt namn, längd, vikt och ålder");
        System.out.println("t.ex Eric Saade 156 126 56");
        String dackage = in.nextLine();

        int space1 = dackage.indexOf(" ");
        String förnamn = dackage.substring(0,space1);

        int  space2 = dackage.indexOf(" ",space1+1);
        String efternam = dackage.substring(space1+1,space2);

        int space3 = dackage.indexOf(" ", space2+1);
        double längd = Double.parseDouble(dackage.substring(space2+1, space3));

        int space4 = dackage.indexOf(" ", space3+1);
        double vikt = Double.parseDouble(dackage.substring(space3+1, space4));

        int space5 = dackage.indexOf(" ", space4+1);
        int ålder = Integer.parseInt(dackage.substring(space4+1, space5));

        System.out.println(förnamn+efternam+längd+vikt+ålder);

        
    }
}
