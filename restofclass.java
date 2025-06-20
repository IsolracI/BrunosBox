public class restofclass {
            /**
         * Calcula los puntos acumulados en cada
         * round de cada pugil y muestralo en la tarjeta.
         * Se llaman score total.
         */

        System.out.println(whiteScoreCard);
        System.out.println("\t FINAL SCORE: " + whiteScoreCard.getRedBoxerFinalScore() + 
        " - " + whiteScoreCard.getBlueBoxerFinalScore() + " FINAL SCORE");

        /**
         * Crea una clase llamada KnockdownRound
         * que implemente la interfaz Round.
         * 
         * Crea un round del tipo "10 - 8" o "8 -10".
         * Muestra la puntuación obtenida por
         * cada boxeador.
         * 
         * En KnockdownRound la puntuacion se almacena
         * como un número entero, no como un String.
         */

        KnockdownRound knockdownRound = new KnockdownRound("10 - 8");
        knockdownRound.boxerRoundScore();
        System.out.println("\n\t knockdown round\t" + knockdownRound.getRedBoxerScore() +
                             " - " + knockdownRound.getBlueBoxerScore());
                        
        /**
         * Crea una clase RoundFactory que crea
         * un objeto de tipo RegularRound o KnockdownRound
         * segun si la puntuación indicada por el /la juez
         * es "10 - 9" o "10 - 8".
         * 
         * Si el metodo getRound() no construye el tipo indicado
         * en el casting, las siguientes líneas daran error
         * en tiempo de ejecución.
         */

        RegularRound regular = (RegularRound) RoundFactory.getRound("9 - 10");
        System.out.println("\t regular round: " + regular);
        KnockdownRound knockdown = (KnockdownRound) RoundFactory.getRound("8 - 10");
        System.out.println("\t knockdown round: " + knockdown);

 
        /**
         * Carga en la tarjeta blue 
         * los puntos de todos los rounds
         * de la segunda tarjeta del array data.
         * 
         * Cada round es un objeto del tipo RegularRound o KnockdownRound.
         * La tarjeta azul es una colección de objetos
         * de tipo Round.
         * 
         * El metodo loadJudgeScoreCard() hace uso del
         * metodo getRound() de la clase RoundFactory
         * para obtener el tipo de round indicado en la 
         * tarjeta del juez.
         * 
         * Al mostrar la tarjeta se observan los 
         * puntos obtenidos por cada pugil en cada round.
         * Se llaman round score.
         * 
         * Calcula los puntos acumulados en cada
         * round de cada pugil y muestralo en la tarjeta.
         * Se llaman score total.
         */

        ScoreCard blueScoreCard = new ScoreCard("BLUE");
        blueScoreCard.setRCorner("Rocky Balboa");
        blueScoreCard.setBCorner("Apollo Creed");
 
        blueScoreCard.loadJudgeScoreCard(
            // Escribe aquí el código para acceder al segundo 
            // elemento del array String[][] data de la línea 13,
            // la tarjeta azul
        );
        System.out.println(blueScoreCard);

        /**
         * Calcula el final score o puntuación total
         * de cada pugil y muestralo en la tarjeta.
         */
        
        System.out.println("\t FINAL SCORE: " + blueScoreCard.getRedBoxerFinalScore() + 
         " - " + blueScoreCard.getBlueBoxerFinalScore() + " FINAL SCORE");

        /**
         * Crea una clase llamada PointsDeducted
         * que implemente la interfaz Round.
         * 
         * Crea un round del tipo "10 - 8 1" o "1 8 -10".
         * Muestra la puntuación obtenida por
         * cada boxeador.
         * 
         * En PointsDeducted la puntuacion se almacena
         * como un número entero, no como un String.
         */

        PointsDeducted deducted = new PointsDeducted("10 - 8 ,1");
        deducted.boxerRoundScore();
        System.out.println("\n\t points deducted round\t" + deducted.getRedBoxerScore() +
                              " - " + deducted.getBlueBoxerScore());
        
        deducted = new PointsDeducted("1, 8 - 10");
        deducted.boxerRoundScore();
        System.out.println("\n\t points deducted round\t" + deducted.getRedBoxerScore() +
                                                    " - " + deducted.getBlueBoxerScore());  
        
         /**
         * Extiende o modifica la clase RoundFactory para crear
         * un objeto de tipo PointsDeducted
         * si la puntuación indicada por el /la juez
         * es "10 - 8 ,1" o "1, 8 - 10".
         * 
         * Si el metodo getRound() no construye el tipo indicado
         * en el casting, las siguiente línea dará error
         * en tiempo de ejecución.
         */

        PointsDeducted pointsDeducted = (PointsDeducted) RoundFactory.getRound("1, 8 - 10");
        System.out.println("\n\t factory deducted round: " + pointsDeducted);

        /**
         * Carga en la tarjeta pink 
         * los puntos de todos los rounds
         * de la tercera tarjeta del array data.
         * 
         * Cada round es un objeto del tipo RegularRound, 
         * KnockdownRound o PointsDeducted.
         * La tarjeta rosa es una colección de objetos
         * de tipo Round.
         * 
         * El metodo loadJudgeScoreCard() hace uso del
         * metodo getRound() de la clase RoundFactory
         * para obtener el tipo de round indicado en la 
         * tarjeta del juez.
         * 
         * Al mostrar la tarjeta se observan los 
         * puntos obtenidos por cada pugil en cada round.
         * Se llaman round score.
         * 
         * Calcula los puntos acumulados en cada
         * round de cada pugil y muestralo en la tarjeta.
         * Se llaman score total.
         */

        ScoreCard pinkScoreCard = new ScoreCard("PINK");
        pinkScoreCard.setRCorner("Rocky Balboa");
        pinkScoreCard.setBCorner("Apollo Creed");
  
        pinkScoreCard.loadJudgeScoreCard(
            // Escribe aquí el código para acceder al tercer 
            // elemento del array String[][] data de la línea 13,
            // la tarjeta rosa
        );
        System.out.println(pinkScoreCard);

        /**
         * Calcula el final score o puntuación total
         * de cada pugil y muestralo en la tarjeta.
         */
        
         System.out.println("\t FINAL SCORE: " + pinkScoreCard.getRedBoxerFinalScore() + 
         " - " + pinkScoreCard.getBlueBoxerFinalScore() + " FINAL SCORE");
        

}
