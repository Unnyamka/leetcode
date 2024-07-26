package Solutions;

public class HeightChecker {

    /*
    A school is trying to take an annual photo of all the students.
    The students are asked to stand in a single file line in non-decreasing order by height.
    Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
    You are given an integer array heights representing the current order that the students are standing in.
    Each heights[i] is the height of the ith student in line (0-indexed).
    Return the number of indices where heights[i] != expected[i].
     */
    public int heightChecker(int[] heights) {
        int[] check = new int[heights.length];
        for(int i =0;i<heights.length;i++)
            check[i]=heights[i];

        for(int i=0;i<check.length;i++)
            for(int j=0;j<check.length-1;j++)
            {
                if(check[j]>check[j+1]){
                    int temp = check[j];
                    check[j] = check[j+1];
                    check[j+1] = temp;
                }
            }
        int wrong = 0;
        for(int i=0;i<heights.length;i++)
            if(heights[i]!=check[i])
                wrong++;
        return wrong;
    }
}
