import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String felineFamily = feline.getFamily();
        Assert.assertEquals("Кошачьи", felineFamily);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        Assert.assertEquals(1, kittensCount);
    }

    @Test
    public void getKittensWithCountTest() {
        Feline feline = new Feline();
        int testCount = 5;
        int kittensCount = feline.getKittens(testCount);
        Assert.assertEquals(testCount, kittensCount);
    }
}
