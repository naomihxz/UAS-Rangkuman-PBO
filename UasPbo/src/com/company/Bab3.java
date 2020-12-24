package com.company;

import java.util.ArrayList;
import java.util.Arrays;

// Class untuk menyimpan string, dan mengidentifikasi apakah str tsb NIM atau bukan
class NimIdentifier {
    private final String str;
    private final Boolean isNIM;
    private final ArrayList<String> listJurusan = new ArrayList<String>(
            Arrays.asList("Matematika",
                    "Fisika",
                    "Kimia",
                    "Biologi",
                    "Informatika",
                    "Farmasi",
                    "Statistika",
                    "Ilmu Lingkungan"
            )
    );

    // Constructor
    public NimIdentifier(String str){
        this.isNIM = (str.length() <= 8) && str.matches("[A-Z][\\d]*"); //[huruf][angka]*
        this.str = str;
    }

    // Getter untuk isNIM
    public Boolean isNim(){
        return isNIM;
    }

    // Getter untuk str asli
    public String getStr(){
        return this.str;
    }

    // Method untuk mengembalikan string yang berisi keterangan dari NIM
    public String identifyThisNIM(){
        String result = "";
        if(this.isNIM){
            // Program hanya bisa menganggap valid angkatan 2000 hingga 2020
            if(this.str.matches("[M][0][1-9][0-2][\\d]*")){ // M0519065
                result += this.listJurusan.get(Character.getNumericValue(this.str.charAt(2))-1)
                        + " angkatan ";
                int year = Integer.parseInt(this.str.substring(3,5));

                // Selebih dari angkatan 20, program akan menganggap tahun angkatan tidak valid
                if(year >= 0 && year <= 20){
                    result += "20" + year;
                }else{
                    result += "tidak valid.";
                }
            }else{
                result = "bukan mahasiswa FMIPA UNS";
            }
        }else{
            result = "Bukan NIM";
        }
        return result;
    }
}

public class Bab3 {
    public static void main(String[] args) {
        // Membuat test case berupa string
        ArrayList<String> testCaseStr =  new ArrayList<String>(
                Arrays.asList("M0120001",
                        "M0220001",
                        "M0317001",
                        "M0418001",
                        "M0519001",
                        "M0616001",
                        "M0719001",
                        "M0819001",
                        "G0017075"
                )
        );

        // Membuat testcase berupa instance dari NimIdentifier dari testcase string
        // Kemudian menampilkan hasilnya
        ArrayList<NimIdentifier> testCaseObj = new ArrayList<NimIdentifier>();
        for(int i=0; i<testCaseStr.size(); i++){
            testCaseObj.add(new NimIdentifier(testCaseStr.get(i)));
            System.out.println(testCaseObj.get(i).getStr()
                    + " -> " + testCaseObj.get(i).identifyThisNIM());
        }
    }
}