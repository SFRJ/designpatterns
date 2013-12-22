package RefactorPatterns.specifications;

import RefactorPatterns.OddEvenKata;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 19/08/13
 * Time: 08:49
 * To change this template use File | Settings | File Templates.
 */
public class OddEvenKataSpecification {

    private OddEvenKata oddEvenKata;

    @Before
    public void prepareDependencies() {
        oddEvenKata = new OddEvenKata();
    }

    @Test
    public void returnsNumbersFrom1To100() {
        String numbers = oddEvenKata.getNumbers("7,8,9,10,11,12,13,14,15,16,17,18,19,20");
        assertThat(numbers,is("odd,even,odd,even,odd,even,odd,even,odd,even,odd,even,odd,even"));
    }

}
