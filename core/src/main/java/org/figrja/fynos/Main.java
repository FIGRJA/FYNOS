package org.figrja.fynos;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    float lol = 0;
    float lolF = 0f;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
    }

    @Override
    public void render() {
        lol+=0.01;
        ScreenUtils.clear(0.0f, 0.0f, 0.0f, (float) Math.sin(lol));
        batch.begin();
        batch.draw(image, (float) (140+(Math.sin(lol)*200)), (float) (210+400*(Math.sin(1-lolF))));
        if (lolF<1.1){
            lolF += 0.01;
            batch.setColor(255, 255, 255, (float) Math.sin(lolF));}
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
