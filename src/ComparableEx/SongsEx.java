package ComparableEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongsEx {

    public static void printSongList(List<Songs> tempList){
        for(Songs s : tempList){
            System.out.println(s.name +"|"+ s.length);
        }
    }

    public static void main(String[] args) {
        Songs obj1 = new Songs("Perry Mason", 240);
        Songs obj2 = new Songs("Glycerine", 120);
        Songs obj3 = new Songs("Black", 300);
        Songs obj4 = new Songs("Turn the Page", 390);
        Songs obj5 = new Songs("Lightening Crashes", 420);
        Songs obj6 = new Songs("Zitti e Buoni", 150);

        List<Songs> songList = new ArrayList<>();
        songList.add(obj1);
        songList.add(obj2);
        songList.add(obj3);
        songList.add(obj4);
        songList.add(obj5);
        songList.add(obj6);

        printSongList(songList);
        System.out.println("=============================1");

        //object sorting can only work after implementation or Comparable/Comparator
        //Collections.sort(songList); // ERROR with normal class
        Collections.sort(songList); //no error with implemented Comparable
        //Collections.reverse(songList);
        printSongList(songList);




    }
}
