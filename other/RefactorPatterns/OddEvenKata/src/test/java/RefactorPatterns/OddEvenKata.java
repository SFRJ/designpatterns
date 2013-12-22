package RefactorPatterns;


public class OddEvenKata {
    public String getNumbers(String range) {
        StringBuffer output = new StringBuffer();
        String [] numbers = range.split(",");
        Detector detector =
        for (String number:numbers) {
            determineNumberType(output, number);
        }
        return output.deleteCharAt(output.length() - 1).toString();
    }

    private void determineNumberType(StringBuffer output, String number) {
        if (new Integer(number)%2==0) {
            output.append("even,");
        }
        else if(new Integer(number)%2!=0) {
            output.append("odd,");
        }
    }
}
