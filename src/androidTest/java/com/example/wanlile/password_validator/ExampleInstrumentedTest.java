package com.example.wanlile.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import android.support.test.espresso.*;
//import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.ActivityTestRule;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.wanlile.password_validator", appContext.getPackageName());
    }
    @Test
    public void check(){
        onView(withId(R.id.password)).perform(typeText("password"));
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Not Strong")));
    }
    @Test
    public void check1(){
        onView(withId(R.id.password)).perform(typeText("Jil#9ijindu"));
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Strong")));
    }
    @Test
    public void check2(){
        onView(withId(R.id.password)).perform(typeText("Liojdnuc"));
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Not Strong")));
    }
    @Test
    public void check3(){
        onView(withId(R.id.password)).perform(typeText("Lioj"));
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Not Strong")));
    }
}
