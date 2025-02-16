import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Assert;


@RunWith(Parameterized.class)
public class LionManeParameterizedTests {
    private final String sex;
    private final Boolean hasMane;

    public LionManeParameterizedTests(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static Object[][] getManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void hasManeTest() throws Exception {

        Lion lion = new Lion(sex, feline);

        Assert.assertEquals(hasMane,lion.doesHaveMane());
    }
}
