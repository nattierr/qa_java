import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);

        String getSound = cat.getSound();
        Assert.assertEquals("Мяу", getSound);

    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);

        List<String> testFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(testFood);
        List<String> lionFood = cat.getFood();
        Mockito.verify(feline).eatMeat();

        Assert.assertEquals(testFood, lionFood);
    }
}
