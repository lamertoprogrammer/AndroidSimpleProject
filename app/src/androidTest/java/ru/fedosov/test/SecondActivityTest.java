package ru.fedosov.test;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.NoActivityResumedException;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> sActivityRule = new ActivityTestRule<>(
            SecondActivity.class);
    @Test
    public void onCreate() {
        Espresso.pressBackUnconditionally();
    }
}