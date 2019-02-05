package testngpackage;
import java.util.ArrayList;

public class ArrayListConsecutive {
    public ArrayList<String> arrayListFunction(ArrayList<String> inputList) {
        ArrayList<String> outputList = new ArrayList<String>();
        for(int i=0;i<inputList.size();i++) {
            String str = inputList.get(i);
            for(int j=0;j<str.length()-1;j++) {
                if(str.charAt(j)==str.charAt(j+1)) {
                    outputList.add(str);
                    break;
                }
            }
        }
        return outputList;
    }
}