package com.github.ccoderjava.leetcodeccoder.services

import com.github.ccoderjava.leetcodeccoder.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
