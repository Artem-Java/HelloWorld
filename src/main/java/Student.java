public class Student {
    private String firstName;
    private String lastName;
    private int[] gradesArray;


    public double averageScore(int[] gradesArray) {
        double averageScore = 0;
        for (int i = 0; i < gradesArray.length; i++) {
            averageScore += gradesArray[i];
        }
        return averageScore / gradesArray.length;
    }

}
