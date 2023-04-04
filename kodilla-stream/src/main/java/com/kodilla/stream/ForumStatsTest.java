package com.kodilla.stream;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ForumStatsTest {

    @Test

    public void testAgeDown40() {
        //given
        ForumStats forumStats = new ForumStats();

        //when
        double result1 = forumStats.ageDown40();
        // then

        assertEquals(2382.0, result1);
    }

    @Test

    public void testAgeUP40() {
        //given
        ForumStats forumStats = new ForumStats();

        //when
        double result1 = forumStats.ageUp40();
        // then

        assertEquals(2.25, result1);
    }


}

