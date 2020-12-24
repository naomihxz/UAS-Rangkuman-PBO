package com.company;

import java.lang.reflect.Array;
import java.util.*;

class Item{
    private final int weight;
    private final int profit;

    Item(int weight, int profit){
        this.weight = weight;
        this.profit = profit;
    }

    public String getItem(){
        return "P : " + this.weight + " ; V : " + this.profit;
    }
}

public class Bab2 {
    public static void main(String[] args) {
        Random rand = new Random();

//    // CONTOH PENGGUNAAN ARRAYLIST
//
//        // Membuat Arraylist
//        ArrayList<Item> knapsack = new ArrayList<Item>();
//        for(int i=0; i<10; i++){
//            knapsack.add(new Item(rand.nextInt(10), rand.nextInt(100)));
//        }
//
//        // Mengakses arraylist
//        System.out.println("Elemen arraylist : ");
//        for(int i=0; i<10; i++){
//            System.out.println("Item ke-" + i + " : " + knapsack.get(i).getItem());
//        }
//
//
//        // Merubah item
//        System.out.println("\nSebelum diubah = " + knapsack.get(4).getItem());
//        knapsack.set(4, new Item(999, 666));
//        System.out.println("Setelah diubah = " + knapsack.get(4).getItem());
//
//        // Menghapus item
//        knapsack.remove(0);
//        System.out.println("\nElemen ke-0 setelah dihapus : " + knapsack.get(0).getItem());
//
    // CONTOH PENGGUNAAN STACK
        // Membuat stack
        Stack<Integer> stack = new Stack<Integer>();

        // Mengecek stack kosong
        boolean isEmpty = stack.empty();
        System.out.println("Apakah stack kosong ? : " + isEmpty);

        // Operasi push pada stack
        for(int i=0; i<4; i++){
            stack.push(rand.nextInt(100));
        }

        // Mengakses seluruh stack
        System.out.println("Stack = " + stack);
        System.out.println("\n");

        // Operasi pop dan peek pada stack
        while(!stack.empty()){
            System.out.println(stack.peek());
            stack.pop();
            System.out.println("Stack = " + stack);
        }
//
//    // CONTOH PENGGUNAAN MAP
//        List<String> mapel = Arrays.asList("Matematika", "Fisika", "Kimia", "Biologi");
//        //Membuat map
//        Map<String, Integer> hasilTest = new HashMap<>();
//
//        // Menambahkan elemen ke map
//        for (String s : mapel) {
//            hasilTest.put(s, rand.nextInt(10)*10);
//        }
//
//        // Mendapatkan key dan value dari map
//        for (Map.Entry e : hasilTest.entrySet()) {
//            System.out.println(e.getKey() + " :  " + e.getValue());
//        }
//
//        // Mendapatkan keynya saja
//        System.out.println("Key hasilTest : " + hasilTest.keySet());
//
//        // Mendapatkan valuenya saja
//        System.out.println("Value hasilTest : " + hasilTest.values());
//
//        // Mendapatkan value dari key
//        System.out.println("Nilai fisika : " + hasilTest.get("Fisika"));
//
//        // Remove
//        hasilTest.remove("Matematika");
//        System.out.println("Setelah dihapus : " + hasilTest);
//
//    // CONTOH PENGGUNAAN SET
//        // Membuat hash set
//        Set<Integer> numbers = new HashSet<>();
//        Set<Integer> odds = new HashSet<>();
//        Set<Integer> even = new HashSet<>();
//
//        // Menambahkan elemen ke set
//        for(int i=1; i<=10; i++){
//            if(i%2 != 0){
//                odds.add(i);
//            }else{
//                even.add(i);
//            }
//        }
//
//        // Union
//        numbers.addAll(odds);
//        numbers.addAll(even);
//        System.out.println("Numbers : " + numbers);
//
//        // Intersection
//        numbers.retainAll(odds);
//        System.out.println("Numbers intersection with odds : " + numbers);
//
//        // Difference
//        numbers.removeAll(odds);
//        System.out.println("Numbers difference with odds : " + numbers);
//
    }
}
