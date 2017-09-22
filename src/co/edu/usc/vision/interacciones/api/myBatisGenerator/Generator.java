package co.edu.usc.vision.interacciones.api.myBatisGenerator;

import org.mybatis.generator.config.xml.ConfigurationParser;

import javax.security.auth.login.Configuration;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vision on 13/05/17.
 */
public class Generator {

    public void myBatis(){

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generatorConfig.xml");

        ConfigurationParser cp = new ConfigurationParser(warnings);

        /*
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
       */

    }
}