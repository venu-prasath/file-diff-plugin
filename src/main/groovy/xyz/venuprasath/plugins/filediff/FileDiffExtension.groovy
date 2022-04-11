package xyz.venuprasath.plugins.filediff

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

import javax.inject.Inject

class FileDiffExtension {
    final Property<File> file1
    final Property<File> file2

    @Inject
    FileDiffExtension(ObjectFactory objects) {
        file1 = objects.propetry(File)
        file2 = objects.propetry(File)

    }
}
