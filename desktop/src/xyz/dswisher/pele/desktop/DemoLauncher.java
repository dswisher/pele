package xyz.dswisher.pele.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.dswisher.pele.demos.BasicDemo;
import xyz.dswisher.pele.demos.EverythingDemo;
import xyz.dswisher.pele.demos.ImageDemo;
import xyz.dswisher.pele.demos.SquidAIDemo;
import xyz.dswisher.pele.demos.WorldMapDemo;
import xyz.dswisher.pele.demos.ZoneDemo;

public class DemoLauncher {
    public static void main (String[] arg) {
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "SquidLib GDX World Map Demo";
        config.width = 1200;
        config.height = 600;
        config.addIcon("Tentacle-16.png", Files.FileType.Absolute);
        config.addIcon("Tentacle-32.png", Files.FileType.Absolute);
        config.addIcon("Tentacle-128.png", Files.FileType.Absolute);

        String demo = "everything";
        if (arg.length > 0) {
            demo = arg[0];
        }

        switch (demo) {
            case "ai":
                new LwjglApplication(new SquidAIDemo(), config);
                break;

            case "basic":
                new LwjglApplication(new BasicDemo(), config);
                break;

            case "everything":
                new LwjglApplication(new EverythingDemo(), config);
                break;

            case "image":
                new LwjglApplication(new ImageDemo(), config);
                break;

            case "world":
                new LwjglApplication(new WorldMapDemo(), config);
                break;

            case "zone":
                new LwjglApplication(new ZoneDemo(), config);
                break;
        }
    }
}
