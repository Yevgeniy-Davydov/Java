import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
  public static void main (String[] args){
    String[] favoriteSongs = {"Queen - Bohemian Rhapsody", "Queen - I Want to Break Free", "Queen - Radio Ga Ga", "Queen - Under Pressure", "Queen -We Will Rock You"};

    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Queen - The Invisible Man");
    desertIslandPlaylist.add("Queen - Sail Away Sweet Sister");
    desertIslandPlaylist.add("Queen - Sheer Heart Attack");
    desertIslandPlaylist.add("Queen - Radio Ga Ga");
    desertIslandPlaylist.add("Queen - Bohemian Rhapsody");

    System.out.println(desertIslandPlaylist);
   
    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(9);
    desertIslandPlaylist.remove(8);
    desertIslandPlaylist.remove(7);
    desertIslandPlaylist.remove(6);
    desertIslandPlaylist.remove(5);
    
  System.out.println(desertIslandPlaylist.size());

  int songA = desertIslandPlaylist.indexOf("Queen - Bohemian Rhapsody");
  int songB = desertIslandPlaylist.indexOf("Queen - Radio Ga Ga");

  String tempA = "Song A";

  desertIslandPlaylist.set(songA, "Queen - Radio Ga Ga");

  System.out.println(desertIslandPlaylist);

  desertIslandPlaylist.set(songB, tempA);
 
  System.out.println(desertIslandPlaylist); 


  }
}
