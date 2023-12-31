plugins {
  kotlin
  id("org.jetbrains.kotlinx.kover")
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
  api(deps.coroutines.core)
  api(deps.arrow.core)
  addUnitTest()
}
