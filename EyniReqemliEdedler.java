import java.util.Arrays;

public class EyniReqemliEdedler {
    public static void main(String[] args) {
        for (int eded = 100000; eded < 167000; eded++) {
            if (eyniReqemler(eded)) {
                System.out.println("Cavab: " + eded);
                break;
            }
        }
    }

    private static boolean eyniReqemler(int eded) {
        char[] sadeReqemler = siralaReqemler(eded);
        for (int i = 2; i <= 6; i++) {
            if (!Arrays.equals(sadeReqemler, siralaReqemler(eded * i))) {
                return false;
            }
        }
        return true;
    }

    private static char[] siralaReqemler(int eded) {
        char[] reqemler = String.valueOf(eded).toCharArray();
        Arrays.sort(reqemler);
        return reqemler;
    }
}
