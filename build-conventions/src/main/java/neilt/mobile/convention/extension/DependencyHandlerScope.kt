package neilt.mobile.convention.extension

import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.ConfigurableFileTree
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementation(project: Project) {
    "implementation"(project)
}

internal fun DependencyHandlerScope.implementation(provider: Provider<*>) {
    "implementation"(provider)
}

internal fun DependencyHandlerScope.implementation(fileTree: ConfigurableFileTree) {
    "implementation"(fileTree)
}

internal fun DependencyHandlerScope.implementation(fileCollection: ConfigurableFileCollection) {
    "implementation"(fileCollection)
}

internal fun DependencyHandlerScope.debugImplementation(provider: Provider<*>) {
    "debugImplementation"(provider)
}

internal fun DependencyHandlerScope.releaseImplementation(provider: Provider<*>) {
    "releaseImplementation"(provider)
}

internal fun DependencyHandlerScope.androidTestImplementation(provider: Provider<*>) {
    "androidTestImplementation"(provider)
}

internal fun DependencyHandlerScope.testImplementation(provider: Provider<*>) {
    "testImplementation"(provider)
}

internal fun <T> DependencyHandlerScope.compileOnly(provider: Provider<*>) {
    "compileOnly"(provider)
}
