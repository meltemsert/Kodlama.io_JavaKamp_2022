public class Main {
    public static void main(String[] args) {

        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harfler");
                break;
            default:
                System.out.println("İnce sesli harfler");
        }
    }
}