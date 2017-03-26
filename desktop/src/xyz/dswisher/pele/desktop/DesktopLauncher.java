package xyz.dswisher.pele.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.dswisher.pele.PeleGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        // TODO - hacky way to take up most of the screen...
		Graphics.DisplayMode desktopMode = LwjglApplicationConfiguration.getDesktopDisplayMode();

		int height = desktopMode.height - 200;
		int width = desktopMode.width - 200;

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Pele";
		config.useGL30 = false;     // OpenGL ES, v2.0 is supposedly more stable
		config.width = width;
		config.height = height;
		config.resizable = false;   // TODO - someday, allow resizing

        Gdx.app = new LwjglApplication(new PeleGame(), config);
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
	}
}
