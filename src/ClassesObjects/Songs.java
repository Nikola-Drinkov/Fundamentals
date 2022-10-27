package ClassesObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static class Song{
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Song> listSongs = new ArrayList<>();

        for(int i=0; i<n; i++){
            String [] songInput = sc.nextLine().split("_");
            Song s = new Song(songInput[0],songInput[1],songInput[2]);
            listSongs.add(s);
        }
        String type = sc.nextLine();
        if(type.equals("all")){
            for (Song song : listSongs)
                System.out.println(song.getName());
        }
        else{
            for(Song song: listSongs){
                if(song.getTypeList().equals(type))
                    System.out.println(song.getName());
            }
        }
    }
}
