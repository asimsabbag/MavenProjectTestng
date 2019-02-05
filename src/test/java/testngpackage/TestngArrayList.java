package testngpackage;
import org.testng.annotations.Test;
import org.testng.Assert;
//import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
public class TestngArrayList {
    @Test
    public void testngArrayList() {
        ArrayList<String> inputList = new ArrayList<String>();
        inputList.add("jhsdh");
        inputList.add("asjjk");
        inputList.add("hhfj");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("asjjk");
        expected.add("hhfj");
        ArrayList<String> actual = new ArrayListConsecutive().arrayListFunction(inputList);
        Assert.assertEquals(actual, expected,"Build failed due to mismatch");
    }
}