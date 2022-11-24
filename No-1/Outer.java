public class Outer {  //Berikut adalah untuk menginisialisasi nama class
    int number = 0; //pendeklarasian Variabel beserta value 
    
    private class Inner{  //disini terdapat Class Inner yang memiliki access modifier private yang bersarang pada Class Outer, artinya terdapat class didalam class
        public void print(){  // didalam class inner terdapat method print yang berisi perintah 
            System.out.println("Mengakses inner class yang ke- " + (++number)); //perintah method print ini berisikan untuk mencetak tulisan yang menjelaskan tentang berapa kali method ini diakses
        }
    }
    void displayFromMethod(){ //Didalam class outer terdapat method untuk mengambil perintah method yang berada didalam class inner
        Inner in = new Inner(); //pendeklarasian objek dari class inner 
        in.print(); //pemanggilan method print pada class inner
    }
}


class Main{  //disini terdapat class main, yang befungsi utama sebagai berjalannya suatu program
    public static void main(String[] args) {
        Outer out = new Outer(); //Pemanggilan objek pada class outer
        out.displayFromMethod(); //pemanggilan method  yang berada dalam class outer
        out.displayFromMethod(); //pemanggilan method yabg berada dalam class outer, disini dipanggil 2x berarti variabel number value nya berrtambah sesuai pemanggilan
    }
}