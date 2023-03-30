import java.io.*;

public class JeopardyQuestions
{
    private String[][] QandA;
    private String[] categories;
    
    public JeopardyQuestions()
    {
        QandA = new String[5][6];
        for (int r = 0; r < QandA.length; r++)
            for (int c = 0; c < QandA[r].length; c++)
                QandA[r][c] = "";
        categories = new String[6];
        for (int i = 0; i < categories.length; i++)
            categories[i] = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("Jeopardy Season 1 database.txt"))) {
            String strRead;
            reader.readLine();
            int row = 0;
            int col = 0;
            int catCount = 0;
            while (QandA[4][5].equals("")) {
                strRead = reader.readLine();
                String splitArray[] = strRead.split("\t");
                String category = splitArray[3];
                String question = splitArray[5];
                String answer = splitArray[6];
                if (row == 0)
                    categories[col] = category;
                if (category.equals(categories[col])) {
                    QandA[row][col] = question + "---" + answer;
                    row++;
                    catCount++;
                }
                else {
                    row = 0;
                    catCount = 0;
                    QandA[row][col] = question + "---" + answer;
                    row++;
                    catCount++;
                    categories[col] = category;
                }
                if (row == 5 && catCount == 5){
                    row = 0;
                    catCount = 0;
                    col++;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public String getQandA(int r, int c)
    {
        return QandA[r][c];
    }
    
    public String getCategory(int cat) 
    {
        return categories[cat];
    }
}
