import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Koltuk {



    public void yerAyir(Character salonNo, Character siraNo, Character koltukNo) throws IOException {
        File dosya = new File("sinema.txt");

        BufferedReader bfReader = new BufferedReader(new FileReader("sinema.txt"));

        int totalLines = 0;
        int columns = 10;
        while(bfReader.readLine() != null){
            totalLines++;
        }

        Scanner scanner = new Scanner(dosya);


        char[][] values = new char[totalLines][columns]; // 0. index salon no || 2. index sira no || 4. index koltuk no || 6. index dolubos durumu

        for(int lines = 0; scanner.hasNextLine() && lines < totalLines; lines++){
            char[] chars = scanner.nextLine().toCharArray();
            for(int i = 0; i < columns && i < chars.length; i++){
                values[lines][i] = chars[i];
            }

        }
        Character dolu = 'd';
        Character empty = 'b';




        for(int i = 0; i < totalLines; i++){
            char temp = values[i][2];
            char temp1 = values[i][4];
            char temp2 = values[i][6];

            if(siraNo.equals(temp) && koltukNo.equals(temp1) && empty.equals(temp2)){

                System.out.println("koltugunuz ayrilmistir.");
                break;

            }else if(siraNo.equals(temp) && koltukNo.equals(temp1) && dolu.equals(temp2)){
                System.out.println("Sectiginiz koltuk dolu");
                System.exit(1);

            }


            
        }












    }






}
