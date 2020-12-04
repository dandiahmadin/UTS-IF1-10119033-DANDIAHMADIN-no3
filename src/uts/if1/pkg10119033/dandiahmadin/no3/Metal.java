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
public class Metal extends Rnb implements HeavyMetal {

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName.concat(" adalah musisi Heavy Metal"));
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName.concat(" adalah musisi Punk"));
    }
    
}
