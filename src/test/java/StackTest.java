import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void shouldReturnAnEmptyStack() {
        Stack stack = new Stack();
        assertThat(stack.size(), equalTo(0));
        assertTrue(stack.isEmpty());
    }

    @Test
    public void shouldPushAnElementToTheStack() {
        Stack stack = new Stack();
        stack.push("Element");
        assertThat(stack.size(), equalTo(1));
    }

    @Test
    public void shouldReturnTheLastElementAddedAsTheTop() {
        Stack stack = new Stack();
        stack.push("Element");
        assertThat(stack.top(), equalTo("Element"));
    }
}
