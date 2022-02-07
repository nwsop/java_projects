import java.util.ArrayList;

class Playlist {


    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Test1");
        desertIslandPlaylist.add("Test2");
        desertIslandPlaylist.add("Test3");
        desertIslandPlaylist.add("Test4");
        desertIslandPlaylist.add("Test5");
        desertIslandPlaylist.add("Test6");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Test6");
        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        int a = desertIslandPlaylist.indexOf("Test1");
        int b = desertIslandPlaylist.indexOf("Test4");

        String tempA = "Test1";
        desertIslandPlaylist.set(a, "Test4");
        desertIslandPlaylist.set(b, tempA);


        System.out.println(desertIslandPlaylist);


    }
}