public class Main {

    private static Kartlar[][] kartlar = new Kartlar[4] [4] ;


    public static void main(String[] args) {


    /*  kartlar[0][0]= new Kartlar['E'];
        kartlar[0][1]= new Kartlar['A'];
        kartlar[0][2]= new Kartlar['B'];
        kartlar[0][3]= new Kartlar['F'];
        kartlar[1][0]= new Kartlar['G'];
        kartlar[1][1]= new Kartlar['A'];
        kartlar[1][2]= new Kartlar['D'];
        kartlar[1][3]= new Kartlar['H'];
        kartlar[2][0]= new Kartlar['F'];
        kartlar[2][1]= new Kartlar['C'];
        kartlar[2][2]= new Kartlar['D'];
        kartlar[2][3]= new Kartlar['H'];
        kartlar[3][0]= new Kartlar['E'];
        kartlar[3][1]= new Kartlar['G'];
        kartlar[3][2]= new Kartlar['B'];
        kartlar[3][3]= new Kartlar['C'];

     */

        oyunTahtasi();


    }

    public static void oyunTahtasi() {

        for(int i = 0 ; i < 4 ; i++) {
            System.out.println("-------------------");
            for(int j= 0 ; j < 4  ;j++) {

                if(kartlar[i][j].isTahmin()) {
                    System.out.println("--" + kartlar[i][j].getDeger() + ("--"));

                }else {
                    System.out.println("-- --");

                }


            }

            System.out.println("");
        }


        System.out.println("-------------------");








    }



}
