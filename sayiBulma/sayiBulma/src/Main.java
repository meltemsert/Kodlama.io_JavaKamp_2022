public class Main {
    public static void main(String[] args) {

        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 9;
        boolean varMi=false;

        for (int sayi : sayilar) {
            if (sayi==aranacak){
                 varMi=true;
                 break;
            }
        }
        if(varMi == true ){
            System.out.println("sayı bulundu.");
        }
        else {
            System.out.println("sayı bulunamadı.");
        }
    }
}