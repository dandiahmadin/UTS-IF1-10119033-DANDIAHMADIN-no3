/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119033.dandiahmadin.no3;

/**
 *
 * @author Dandi Ahmadin
 */
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock {
    public void genreHardRock(String artistName) {
        System.out.println(artistName.concat(" adalah musisi HardRock"));
    }

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName.concat(" adalah musisi PopRock"));
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName.concat(" adalah musisi ProgressiveRock"));
    }

    @Override
    public void genrePsycehedellic(String artistName) {
        System.out.println(artistName.concat(" adalah musisi PsychelicRock"));
    }
    
    
}
