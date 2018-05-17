package uk.co.jamiecruwys.wordsuggestions

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import org.junit.Test

class SuggestionsActivityTest: BaseActivityTest<SuggestionsActivity>() {
    override fun provideTestActivity(): Class<SuggestionsActivity> = SuggestionsActivity::class.java

    @Test
    @Throws(Exception::class)
    fun testAutoCompleteExists() {
        onView(withId(R.id.autocomplete)).check(matches(isDisplayed()))
    }
}