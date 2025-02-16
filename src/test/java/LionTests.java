import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Feline feline;


    @Test
    public void getKittenTest() throws Exception {
        Lion lion = new Lion("Самка", feline);

        int testKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(testKittens);
        int lionKittens = lion.getKittens();
        Mockito.verify(feline).getKittens();

        Assert.assertEquals(testKittens, lionKittens);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);

        List<String> testFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(testFood);
        List<String> lionFood = lion.getFood();
        Mockito.verify(feline).eatMeat();

        Assert.assertEquals(testFood, lionFood);
    }

    @Test
    public void incorrectSexTest() {
        try {
            Lion lion = new Lion("Тест", feline);
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
