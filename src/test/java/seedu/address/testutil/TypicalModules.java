package seedu.address.testutil;


import seedu.address.model.AddressBook;
import seedu.address.model.module.Module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A utility class containing a list of {@code Module} objects to be used in tests.
 */
public class TypicalModules {
    public static final Module CS2040S = new ModuleBuilder()
            .withCode("CS2040S")
            .withYear("1")
            .withSem("2")
            .withGrade("A-").build();
    public static final Module CS2030S = new ModuleBuilder()
            .withCode("CS2030S")
            .withYear("1")
            .withSem("2")
            .withGrade("A").build();
    public static final Module MA2001 = new ModuleBuilder()
            .withCode("MA2001")
            .withYear("1")
            .withSem("2")
            .withGrade("B+").build();

    // Manually added
    public static final Module CS2101 = new ModuleBuilder()
            .withCode("MA2001")
            .withYear("2")
            .withSem("1")
            .withGrade("IP").build();

    public static final Module GEA1000 = new ModuleBuilder()
            .withCode("GEA1000")
            .withYear("1")
            .withSem("1")
            .withGrade("A+").build();
    //Add more

    private TypicalModules() {}

    /**
     * Returns an {@code AddressBook} with all the typical modules.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Module module : getTypicalModules()) {
            ab.addModule(module);
        }
        return ab;
    }

    public static List<Module> getTypicalModules() {
        return new ArrayList<>(Arrays.asList(CS2030S, CS2040S, MA2001));
    }

}
