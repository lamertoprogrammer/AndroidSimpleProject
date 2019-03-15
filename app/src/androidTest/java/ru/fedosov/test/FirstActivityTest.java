package ru.fedosov.test;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class FirstActivityTest {

    @Rule
    public ActivityTestRule<FirstActivity> fActivityRule = new ActivityTestRule<>(
            FirstActivity.class);

    @Test
    public void onCreate() {
        onView(withId(R.id.edittext)).perform(typeText("gbf"));
        onView(withId(R.id.button)).perform(click());
    }
}