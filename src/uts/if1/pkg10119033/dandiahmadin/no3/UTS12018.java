/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119033.dandiahmadin.no3;

/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menentukan genre musik dengan pendekatan 
 * object oriented dan penerapan konsep pewarisan
 */
public class UTS12018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rnb blues1 = new Rnb();
        blues1.setArtistName("Jimmy Hendrik");
        blues1.genreBlues(blues1.getArtistName());
        
        Rnb jazz1 = new Rnb();
        jazz1.setArtistName("Chad Baker");
        jazz1.genreJazz(jazz1.getArtistName());
        
        Folk folk1 = new Folk();
        folk1.setArtistName("Bob Dylan");
        folk1.genreFolk(folk1.getArtistName());
        
        Rockabilly rockabilly1 = new Rockabilly();
        rockabilly1.setArtistName("Elvis Presley");
        rockabilly1.genreRockabilly(rockabilly1.getArtistName());
        
        HardRock progressiveRock1 = new HardRock();
        progressiveRock1.setArtistName("DreamTheater");
        progressiveRock1.genreProgressiveRock(progressiveRock1.getArtistName());
        
        HardRock psychedelic1 = new HardRock();
        psychedelic1.setArtistName("The Doors");
        psychedelic1.genrePsycehedellic(psychedelic1.getArtistName());
        
        HardRock popRock1 = new HardRock();
        popRock1.setArtistName("Kiss");
        popRock1.genrePopRock(popRock1.getArtistName());
        
        Metal punk1 = new Metal();
        punk1.setArtistName("MXPX");
        punk1.genrePunk(punk1.getArtistName());
        
        Metal heavyMetal1 = new Metal();
        heavyMetal1.setArtistName("METALLICA");
        heavyMetal1.genreHeavyMetal(heavyMetal1.getArtistName());
        
        Gridcore gridcore1 = new Gridcore();
        gridcore1.setArtistName("Mesin Tempur");
        gridcore1.genreGridcore(gridcore1.getArtistName());
        
        DeathMetal deathMetal1 = new DeathMetal();
        deathMetal1.setArtistName("JASAD");
        deathMetal1.genreDeathMetal(deathMetal1.getArtistName());
        
        DeathCoreKepiting deathCoreKepiting1 = new DeathCoreKepiting();
        deathCoreKepiting1.setArtistName("Revenge The Fate");
        deathCoreKepiting1.genreDeathCoreKepiting(deathCoreKepiting1.getArtistName());
        
        BlackMetal blackMetal1 = new BlackMetal();
        blackMetal1.setArtistName("Behemoth");
        blackMetal1.genreBlackMetal(blackMetal1.getArtistName());
        
        NewSkul newSkul1 = new NewSkul();
        newSkul1.setArtistName("HATEBREDD");
        newSkul1.genreNewSkul(newSkul1.getArtistName());
        
        
    }
    
}
