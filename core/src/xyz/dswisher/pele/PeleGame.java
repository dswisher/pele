package xyz.dswisher.pele;

import com.badlogic.gdx.Game;

public class PeleGame extends Game {

    public static final MainGameScreen _mainGameScreen = new MainGameScreen();

    @Override
    public void create() {
        setScreen(_mainGameScreen);
    }

    @Override
    public void dispose() {
        _mainGameScreen.dispose();
    }
}
