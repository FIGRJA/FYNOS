package org.figrja.funos;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class stage extends ApplicationAdapter{
    private int width;
    private int height;
    

    public stage(){this(1280,720);}
    public stage(int width,int height) {
        this.height = height;
        this.width = width;
    }
    @Override
	public void create () {
	}

	@Override
	public void resize (int width, int height) {
	}

    private SpriteBatch batch;
    private String color="000000FF";
    private ArrayList<Sprite> sprites;
	@Override
	public void render () {
        ScreenUtils.clear(Color.valueOf(color));
        batch.begin();
        for(int i = 0;i<sprites.size();i++){
            Sprite sprite = sprites.get(i);
            batch.draw(sprite.texture,sprite.x,sprite.y);
        }
        batch.end();
	}
    public void add(Sprite sprite){
        sprites.add(sprite);
    }
    public void add(Texture texture){
        sprites.add(new Sprite(texture));
    }

	//@Override
	//public void pause () {
	//}

	//@Override
	//public void resume () {
	//}

	@Override
	public void dispose () {
	}
    
}
