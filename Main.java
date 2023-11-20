import java.util.HashMap;

public class Main {
    static void findDuplicateEvenNumbers(int[] arr) {
        // Bir sayının kaç kere tekrar ettiğini tutan bir HashMap
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Diziyi tarayarak çift sayıları kontrol et ve tekrar sayısını güncelle
        for (int num : arr) {
            if (num % 2 == 0) { // Çift sayıları kontrol et
                int count = countMap.getOrDefault(num, 0);
                countMap.put(num, count + 1);

            }
        }

        // HashMap'te tekrar eden çift sayıları ekrana yazdır
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count > 1) {
               System.out.println(num + " tekrar eden sayısı: " + count);
            }
        }
    }


    public static void main(String[] args) {
        int[] sayiDizisi = {3, 7, 3, 3, 2, 9, 10,10, 21, 1, 33, 9, 1};

        System.out.println("Tekrar eden çift sayılar:");
        findDuplicateEvenNumbers(sayiDizisi);
    }
}