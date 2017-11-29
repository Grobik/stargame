package ru.geekbrains.stargame.screen.game.ui;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.engine.math.Rect;
import ru.geekbrains.engine.ui.ActionListener;
import ru.geekbrains.engine.ui.ScaledTouchUpButton;

public class ButtonSuperAttack extends ScaledTouchUpButton {
    /**
     * Конструктор
     *
     * @param atlas     атлас
     * @param listener   слушатель событий
     * @param pressScale на сколько уменьшить кнопку при нажатии
     */
    public ButtonSuperAttack(TextureAtlas atlas, ActionListener listener, float pressScale) {
        super(atlas.findRegion("btAttack"), listener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setLeft(worldBounds.getLeft());
    }
}
