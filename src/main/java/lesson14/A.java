package lesson14;

public class A {
    public static void showTime(){
        for(int chas=0; chas<=6; chas++){
            NEXTMINUTA:
            for(int minuta=0; minuta<60; minuta++){
                if (chas>1 && minuta%10==0) break;
                for (int secunda=0; secunda<60; secunda++){
                    if (secunda*chas>minuta) continue NEXTMINUTA;
                    System.out.println(chas+":"+minuta+":"+secunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        A.showTime();
    }
}
