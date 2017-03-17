package xyz.dswisher.pele.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.dswisher.pele.PeleGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Pele";
		config.width = 800;
		config.height = 600;

		new LwjglApplication(new PeleGame(), config);
	}
}
