package com.hfad.ad3lesson6;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import com.hfad.ad3lesson6.ui.MainActivity;
import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ActivityMainTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addClickTest() {
        type("40", "5");
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("45")));
    }

    @Test
    public void subClickTest() {
        type("50", "5");
        onView(withId(R.id.btn_subtract)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("45")));
    }

    @Test
    public void divClickTest() {
        type("20", "20");
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("1")));
    }

    @Test
    public void mulClickTest() {
        type("15", "2");
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("30")));
    }

    @Test
    public void powClickTest() {
        type("5", "3");
        onView(withId(R.id.btn_pow)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("125")));
    }

    @Test
    public void rootClickTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("25"));
        onView(withId(R.id.btn_root)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("5")));
    }

    @Test
    public void reverseClickTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("ANDROID IOS"));
        onView(withId(R.id.btn_reverse)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("IOS ANDROID")));
    }

    private void type(String s, String s2) {
        onView(withId(R.id.et_operator_one)).perform(typeText(s));
        onView(withId(R.id.et_operator_two)).perform(typeText(s2));
    }
}