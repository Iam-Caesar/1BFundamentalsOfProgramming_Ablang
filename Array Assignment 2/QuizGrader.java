

public class QuizGrader { // simula ng program
    public static void main (String [] args){ // simula ng main method
        char answerKey[] = {'A', 'C', 'B' , 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; // pag initialize ng variable para sa  tamang answer key
        char studentAnswers[] = {'A','B','B','D','C','C','C','B','A','A'}; // pag initialize ng variable para sa sagot ng student

        int correctCount = 0; // pag initialize ng variable para gamitin upang bilangin kung ilan ang tamang sagot
        for (int i = 0; i < answerKey.length; i++){ // simula ng for loop, binabangga ang loop na eto sa haba ng quiz, kaya ginamit ang answerKey.length (gamit ng bilang ng answerKey array)
            if (answerKey[i] == (Character.toUpperCase(studentAnswers[i]))){ // simula ng if, na nagsasabing kung ang sagot ng student (dinidesregard ang lowercase dahil
                // tinatransform ito sa upper case) ay equal sa answerKey ,
                correctCount++ ; // bibiling ang correct count pataas
            } else { // kung hindi tugma ang sagot
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered " + "'" + (Character.toUpperCase(studentAnswers[i])) + "', " + "correct answer is '" + answerKey[i] + "'" );
                // magprint ng tamang sagot kung mali ang sagot ng student
            } // close ng if-else
        } // close ng for loop

        double scorePercentage = ((double) correctCount / (double) studentAnswers.length) * 100; // pag initialize ng scorePercentage para macalculate ang score percent para gamitin
        // gumagamit tayo ng double para maayos ang pag divide bago i multiply sa 100, pareho neto ang pag gamit din ng double para sa correctCount at studentAnswers
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length); // pag print kung ilang ang tamang nasagutan over kung ilang ang question
        System.out.println("Percentage: " + scorePercentage + "%"); // pag print ng percentage gamit ng scorePercentage variable

        if (scorePercentage < 70.0){ // simula ng if statement, kinokompara ang scorePercentage sa 70.0
            System.out.println("Result: FAIL"); // kung mas mababa sa 70.0 ang percentage, bagsak
        } else { // kung hindi
            System.out.println("Result: PASS"); // pasado ang ipri-print
        } // pag close ng if

    } // pag close ng main method
} // pag close ng program
