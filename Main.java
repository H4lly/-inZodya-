import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int birthYear,zodiactürü;

        Scanner inp = new Scanner(System.in);

        // Öncelikle kullanıcıdan doğum yılı bilgisini alıyoruz.

        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = inp.nextInt();

        zodiactürü = birthYear % 12;
        String zodiac;

        switch(zodiactürü){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                zodiac = "Geçersiz";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
    }
}
