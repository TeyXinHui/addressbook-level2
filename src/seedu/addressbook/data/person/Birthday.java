package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's birthday in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidBirthday(String)}
 */
public class Birthday {

    public static final String EXAMPLE = "19-09-1990";
    public static final String MESSAGE_BIRTHDAY_CONSTRAINTS = "Person birthdays should be in the format: DD-MM-YYYY, where DD is the day, MM is the month, YYYY is the year";
    public static final String BIRTHDAY_VALIDATION_REGEX = "^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$"; //copied from StackOverFlow

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given Birthday.
     *
     * @throws IllegalValueException if given Birthday string is invalid.
     */
    public Birthday(String birthday, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedBirthday = birthday.trim();
        if (!isValidBirthday(trimmedBirthday)) {
            throw new IllegalValueException(MESSAGE_BIRTHDAY_CONSTRAINTS);
        }
        this.value = trimmedBirthday;
    }

    /**
     * Returns true if the given string is a valid person birthday.
     */
    public static boolean isValidBirthday(String test) {
        return test.matches(BIRTHDAY_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Birthday // instanceof handles nulls
                && this.value.equals(((Birthday) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}