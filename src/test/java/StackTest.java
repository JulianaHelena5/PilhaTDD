import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class StackTest {

    @Test
    public void shouldReturnAnEmptyStack() {
        Stack stack = new Stack();
        assertThat(stack.size(), equalTo(0));
    }
}
