package com.github.leventarican.refresh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * demonstration of Navigation framework:
 * - check build.gradle (project and module)
 * - [Page3] uses [androidx.navigation.fragment.NavHostFragment]
 * - this activity has fragments. The user can navigate from [Page3TitleFragment] to [Page3ImageFragment] ...
 */
class Page3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)


    }
}
