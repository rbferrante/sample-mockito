import com.rbf7.AgeList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgeListTest {

    AgeList ageList;

    @BeforeEach
    void initAge() {
        ageList = new AgeList();
        ageList.add("Mary", 43);

    }

    @Test
    void testAdd() {
        ageList.add("John", 40);
        assertEquals(40, ageList.getAgeByName("John"));
    }

    @Test
    void testRemove() {
        ageList.remove("Mary");
        assertEquals(0, ageList.getSize());
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            ageList.getAgeByName("Mary");
        });
        assertNotNull(exception);

    }
}
