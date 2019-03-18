package com.bentey.plugin.depend

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.extensions.create("depend", DependComp)
    }
}