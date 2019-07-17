package com.fairydeck.runner;

import com.badlogic.gdx.Game;
import com.fairydeck.runner.screens.MenuScreen;

public class RunnerGame extends Game {

	@Override
	public void create () {
		this.setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {

	}
}
