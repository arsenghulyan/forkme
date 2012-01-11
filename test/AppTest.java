import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for {@link App}.
 *
 * @author Gevorg Harutyunyan.
 */
public class AppTest {
    /**
     * Check is still project mission known.
     */
    @Test
    public void testMission() {
        // Fetches mission.
        String mission = App.getMission();
        
        // Checks mission.
        assertTrue( "Project mission is unknown!", mission.contains("project with known mission!") );
    }
}
