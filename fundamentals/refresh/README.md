# refresh android and kotlin
* project based on _Empty Activity_
* any `Activity` has to be declared in `AndroidManifest.xml`
* `AndroidManifest.xml` you also define app permission: use internet, contact data, ...
* gradle build system
    * `build.gradle(Project: ...)` common for all app modules: project-level
    * `build.gradle(Module: ...)` each module has its own gradle file: module level
* an `Activity` draws the UI and receives input events
* a layout file is _inflated_ into view objects in memory when the activity starts
