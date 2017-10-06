import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharsTest {
    @Test
    public void uniqueCharacters1() throws Exception {
        assertEquals("[n, g, r, m]", UniqueChars.uniqueCharacters("anagram"));
    }

    @Test
    public void uniqueCharacters2() throws Exception {
        assertEquals("[d]", UniqueChars.uniqueCharacters("madam"));
    }

    @Test
    public void uniqueCharacters3() throws Exception {
        assertEquals("[]", UniqueChars.uniqueCharacters(""));
    }

    @Test
    public void uniqueCharacters4() throws Exception {
        assertEquals("[1]", UniqueChars.uniqueCharacters("1"));
    }

}