package xyz.dswisher.pele.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.dswisher.pele.PeleGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Pele";
		config.useGL30 = false;     // OpenGL ES, v2.0 is supposedly more stable
		config.width = 800;
		config.height = 600;

        Gdx.app = new LwjglApplication(new PeleGame(), config);
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
	}
}
