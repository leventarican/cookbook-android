package com.github.leventarican.refresh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * demonstration of Navigation framework:
 * - check build.gradle (project and module): navigation library dependency need to be activated
 * - [Page3] uses [androidx.navigation.fragment.NavHostFragment] where the navigation starts.
 * - this activity has fragments. The user can navigate from [Page3TitleFragment] to [Page3ImageFragment]
 * - from [Page3ImageFragment] conditionally either to [Page3JavaFragment] or [Page3KotlinFragment]
 * - see `navigation.xml` the navigation graph
 *
 * demonstration of Safe Args: `navigation-safe-args-gradle-plugin`
 * - by adding the safe args plugin it will generate __Direction__ classes for each Fragment where direction are defined > see generated java folder
 * - __WITH__ Safe Args you can pass data type-safe between fragment.
 * - https://developer.android.com/guide/navigation/navigation-pass-data#Safe-args
 * - https://codelabs.developers.google.com/codelabs/kotlin-android-training-start-external-activity/index.html#2
 */
class Page3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)


    }
}
