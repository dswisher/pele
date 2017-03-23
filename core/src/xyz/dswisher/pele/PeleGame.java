package xyz.dswisher.pele;

import com.badlogic.gdx.Game;

public class PeleGame extends Game {

    private MainMenuScreen mainMenuScreen;

    @Override
    public void create() {
        mainMenuScreen = new MainMenuScreen(this);
        setScreen(mainMenuScreen);
    }

    @Override
    public void dispose() {
    }
}
