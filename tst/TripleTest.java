import com.company.Triple;
import org.junit.Assert;
import org.junit.Test;

public class TripleTest {

    @Test
    public void testTripleClass() {

        Triple<Integer, Integer, Integer> integerBox = new Triple<Integer, Integer, Integer>(7, 8, 9);
        Integer left1=7;
        Integer middle1=8;
        Integer right1=9;
        Assert.assertEquals(left1,integerBox.getLeft());
        Assert.assertEquals(middle1,integerBox.getMiddle());
        Assert.assertEquals(right1,9,integerBox.getRight());

        Triple<String, String, String> stringBox = new Triple<String, String, String>("line", "live", "long");
        String left2= "line";
        String middle2="live";
        String right2="long";
        Assert.assertEquals(left2,stringBox.getLeft());
        Assert.assertEquals(middle2,stringBox.getMiddle());
        Assert.assertEquals(right2,stringBox.getRight());

        Triple<Double, Double, Double> doubleBox = new Triple<Double, Double, Double>(7.15, 5.67, 7.77);
        Double left3=7.15;
        Double middle3=5.67;
        Double right3=7.77;
        Assert.assertEquals(left3,doubleBox.getLeft());
        Assert.assertEquals(middle3,doubleBox.getMiddle());
        Assert.assertEquals(right3,doubleBox.getRight());

        Triple<Integer, String, Double> mixedBox = new Triple<Integer, String, Double>(5, "fun", 6.87);
        Integer left4=5;
        String middle4="fun";
        Double right4=6.87;
        Assert.assertEquals(left4,mixedBox.getLeft());
        Assert.assertEquals(middle4,mixedBox.getMiddle());
        Assert.assertEquals(right4,mixedBox.getRight());

    }
}


