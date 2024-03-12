/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playlist;

/**
 *
 * @author 97114
 */
public class Musicas {
    
    //Atributos
    String Title;
    String Album;
    String Date;
    int Time;
    
    //Metodos
    //Primera Forma
    /*public void Musicas(String _Title, String _Album, String _Date, int _Time){
       Title=_Title727678;
       Album=_Album;
       Date=_Date;
       Time=_Time;
    }*/
    
    //Segunda Forma
    public Musicas(String Title, String Album, String Date, int Time){
        this.Title=Title;
        this.Album=Album;
        this.Date=Date;
        this.Time=Time;
    }
    
    public void ShowPlaylist(){
        System.out.println("Title"+Title);
        System.out.println("Album"+Album);
        System.out.println("Date"+Date);
        System.out.println("Time"+Time);
    }
}
