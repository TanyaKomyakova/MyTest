// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       BonusMilesService service = new BonusMilesService();
       int miles = service.calculate(1_045);
            System.out.println(miles);

        BmiService imtservice = new BmiService();
        double IMT = imtservice.calculate(49,1.64);
        System.out.println(IMT);
        }

    }