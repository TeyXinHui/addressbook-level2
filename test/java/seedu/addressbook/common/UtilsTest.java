package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    @Test
    private void isAnyNull() throws Exception {
        // empty list
        assertNoNull();

        // at least one object is null, but not all
        assertHasNull(null, "abc", 1);
        assertHasNull(null, 1);
        assertHasNull("", null, "abc", null);
        assertHasNull("abc", null, null);

        // all objects are null
        assertHasNull(null, null, null);
        assertHasNull(null, null);

        // there is no null
        assertNoNull("abc", "abc");
        assertNoNull("abc", "", "abc", "ABC");
        assertNoNull("", "abc", "a", "abc");
        assertNoNull(1, new Integer(1));
        assertNoNull(1, 1, new Integer(1));
        assertNoNull(1, 1);
        assertNoNull(1, "a", "b", 1);
    }

    private void assertHasNull(Object... objects) {
        assertTrue(Utils.isAnyNull(Arrays.asList(objects)));
    }

    private void assertNoNull(Object... objects) {
        assertFalse(Utils.isAnyNull(Arrays.asList(objects)));
    }
}
