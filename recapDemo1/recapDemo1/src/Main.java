public class Main {

    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=15;
        int sayi3=30;

        String metin= "En büyük sayı:";

        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println(metin + sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println(metin + sayi2);
        } else {
            System.out.println(metin  + sayi3);
        }
    }
}
