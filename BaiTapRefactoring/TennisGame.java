package BaiTapRefactoring;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String disPlay = "";
        int tempScore=0;
        if (scorePlayer1==scorePlayer2)
        {
            switch (scorePlayer1)
            {
                case 0:
                    disPlay = "Love-All";
                    break;
                case 1:
                    disPlay = "Fifteen-All";
                    break;
                case 2:
                    disPlay = "Thirty-All";
                    break;
                case 3:
                    disPlay = "Forty-All";
                    break;
                default:
                    disPlay = "Deuce";
                    break;

            }
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4)
        {
            int advantageScore = scorePlayer1-scorePlayer2;
            if (advantageScore==1) disPlay ="Advantage player1";
            else if (advantageScore ==-1) disPlay ="Advantage player2";
            else if (advantageScore>=2) disPlay = "Win for player1";
            else disPlay ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1)
                    tempScore = scorePlayer1;
                else
                {   disPlay+="-";
                    tempScore = scorePlayer2;}

                switch(tempScore)
                {
                    case 0:
                        disPlay+="Love";
                        break;
                    case 1:
                        disPlay+="Fifteen";
                        break;
                    case 2:
                        disPlay+="Thirty";
                        break;
                    case 3:
                        disPlay+="Forty";
                        break;
                }
            }
        }
        return disPlay;
    }
}
