package xyz.dswisher.pele.desktop;

// import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.dswisher.pele.WorldMapDemo;

public class DemoLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "SquidLib GDX World Map Demo";
        config.width = 1200;
        config.height = 600;
        // config.addIcon("Tentacle-16.png", Files.FileType.Classpath);
        // config.addIcon("Tentacle-32.png", Files.FileType.Classpath);
        // config.addIcon("Tentacle-128.png", Files.FileType.Classpath);
        new LwjglApplication(new WorldMapDemo(), config);
    }
}
