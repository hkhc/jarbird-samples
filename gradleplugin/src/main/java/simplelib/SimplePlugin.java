package simplelib;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SimplePlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        SimpleExtension ext = new SimpleExtension();
        project.getExtensions().add("simple", ext);

        project.afterEvaluate(p -> System.out.println("Hello "+ext.text));

    }
}
