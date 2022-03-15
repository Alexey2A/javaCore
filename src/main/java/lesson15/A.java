package lesson15;

public class A {
    public static void showTime() {
        int c = 0;
        while (c < 6) {
            int m = -1;
            NEXTMINUTA:
            do {
                m++;
                if (c > 1 && m % 10 == 0) break;
                int s = 0;
                while (s < 60) {
                    if (s * c > m) continue NEXTMINUTA;
                    System.out.println(c + ":" + m + ":" + s);
                    s++;
                }
            } while (m < 59);
            c++;
        }
    }

    public static void main(String[] args) {
        A.showTime();
    }
}
