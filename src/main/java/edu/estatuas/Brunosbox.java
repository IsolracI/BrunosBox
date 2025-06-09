package edu.estatuas;

import com.github.freva.asciitable.AsciiTable;

public class Brunosbox 
{
    public static void main( String[] args ) {

        System.out.println("\n - I see three of them out there." + 
                           "\n - Hit the one in the middle.- Rocky Balboa\n");

        String[] headers = {"Round 1", "Round 2", "Round 3", "Round 4", "Round 5", 
                            "Round 6", "Round 7", "Round 8", "Round 9", "Round 10"};

        String[][] data = {

            //  White ScoreCard
            {"9 - 10", 
             "9 - 10", 
             "9 - 10", 
             "9 - 10",
             "10 - 9",
             "10 - 9",
             "10 - 9", 
             "9 - 10", 
             "10 - 9", 
             "9 - 10"},
            
             // Blue ScoreCard
            {"9 - 10", 
             "9 - 10", 
             "9 - 10", 
             "8 - 10", // knockdown
             "10 - 8", // knockdown
             "10 - 8",
             "10 - 9", 
             "9 - 10", 
             "10 - 9", 
             "10 - 9"},

            // Pink ScoreCard
            {"9 - 10", 
             "9 - 10", 
             "9 - 10", 
             "1, 8 - 10", // referee point deduction
             "10 - 8",    // knockdown
             "10 - 8 ,1", // referee point deduction
             "10 - 9", 
             "9 - 10", 
             "10 - 9", 
             "10 - 8" // knockdown
            }

        };

        System.out.println(AsciiTable.getTable(headers, data));
        /**
         * Crea una tarjeta de puntos de boxeo
         * a partir de la tarjeta blanca entregada
         * por el juez blanco.
         */

        ScoreCard whiteScoreCard = new ScoreCard("WHITE");

        /**
         * Asigna el nombre de los pugiles
         * Rocky Balboa (red) vs Apollo Creed (blue)
         */
        
        whiteScoreCard.setRCorner("Rocky Balboa");
        whiteScoreCard.setBCorner("Apollo Creed");

        /**
         * Muestra la tarjeta por consola con
         * el formato que se propone en el enunciado
         * del ejercicio.
         */

        System.out.println(whiteScoreCard);

        /**
         * Crea una clase llamada RegularRound
         * que implemente la interfaz Round.
         * 
         * Crea un round del tipo "10 - 9" o "9 - 10".
         * Muestra la puntuación obtenida por
         * cada boxeador.
         * 
         * En Round la puntuacion se almacena
         * como un número entero, no como un String.
         * 
         * Pasa el caso test que propongo.
         */

        RegularRound round = new RegularRound("10 - 9");
        round.boxerRoundScore();
        System.out.println("\n\t Regular round\t" + round.getRedBoxerScore() +
                            " - " + round.getBlueBoxerScore());

    }


}
