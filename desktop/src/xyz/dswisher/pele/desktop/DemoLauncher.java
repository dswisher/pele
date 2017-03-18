package xyz.dswisher.pele.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.dswisher.pele.demos.simplegame.DropGame;
import xyz.dswisher.pele.demos.squidlib.BasicDemo;
import xyz.dswisher.pele.demos.squidlib.EverythingDemo;
import xyz.dswisher.pele.demos.squidlib.ImageDemo;
import xyz.dswisher.pele.demos.squidlib.SquidAIDemo;
import xyz.dswisher.pele.demos.squidlib.WorldMapDemo;
import xyz.dswisher.pele.demos.squidlib.ZoneDemo;

public class DemoLauncher {
    public static void main (String[] arg) {
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        String demo = "drop";
        if (arg.length > 0) {
            demo = arg[0];
        }

        switch (demo) {
            case "ai":
                config.title = "SquidLib GDX AI Demo";
                config.width = 40 * 2 * 6;
                config.height = 40 * 12;
                new LwjglApplication(new SquidAIDemo(), config);
                break;

            case "basic":
                config.title = "SquidLib GDX Basic Demo";
                config.width = 80 * 14;
                config.height = 32 * 21;
                new LwjglApplication(new BasicDemo(), config);
                break;

            case "drop":
                config.title = "Drop";
                config.width = 800;
                config.height = 480;
                new LwjglApplication(new DropGame(), config);
                break;

            case "everything":
                config.title = "SquidLib GDX Everything Demo";
                config.width = 90 * 13;
                config.height = 34 * 26;
                new LwjglApplication(new EverythingDemo(), config);
                break;

            case "image":
                config.title = "SquidLib GDX Image Demo";
                config.width = 30 * 2 * 18;
                config.height = 20 * 36;
                new LwjglApplication(new ImageDemo(), config);
                break;

            case "world":
                config.title = "SquidLib GDX World Map Demo";
                config.width = 1200;
                config.height = 600;
                new LwjglApplication(new WorldMapDemo(), config);
                break;

            case "zone":
                config.title = "SquidLib GDX Zone Demo";
                config.width = 80 * 16;
                config.height = 50 * 16;
                config.vSyncEnabled = false;
                new LwjglApplication(new ZoneDemo(), config);
                break;
        }
    }
}
