package seedu.mentorstack.model;

import javafx.collections.ObservableList;
import seedu.mentorstack.model.person.Person;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyMentorstack {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Person> getPersonList();

}
