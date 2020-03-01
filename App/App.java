public class Main {

    public static void App(String[] args) {

        short mbInKb = 1024;
        int facebookFriends = 150000;
        long starsInUniverse = 15555555555555555L;
        double normalTemp = 36.6;

        byte mbInKb1 = (byte) mbInKb;
        short facebookFriends1 = (short) facebookFriends;
        int starsInUniverse1 = (int) starsInUniverse;
        long normalTemp1 = (long) normalTemp;

        System.out.println(mbInKb1);
        System.out.println(facebookFriends1);
        System.out.println(starsInUniverse1);
        System.out.println(normalTemp1);

        //short → byte; int → short; long → int; double → long;
    }
}