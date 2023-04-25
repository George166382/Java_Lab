package group.homework;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.exception.VelocityException;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class ReportCommand implements Command { 
    private Catalog catalog;

    public ReportCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute() {
      Velocity.init();
        Template template = Velocity.getTemplate("./src/main/java/group/homework/report.vm");

        VelocityContext context = new VelocityContext();
        context.internalPut("documents", catalog.getDocs());
        Writer writer = new StringWriter();
        template.merge(context, writer);

        System.out.println(writer);
    }
}
