package com.jap.linkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PlayListImpl {
    private PlayList songList = new PlayList();

    public PlayList readSongList(String fileName) throws IOException
    {

        File file = new File(fileName);
        FileReader filereader = new FileReader(file);
        BufferedReader br = new BufferedReader(filereader);

        String str;

        int i=0;
        while((str=br.readLine()) != null)
        {
            String [] arr=str.split(",");
            songList.insertASong(new Song(arr[0],arr[1]));
            i++;
        }
        return songList;
    }

}
