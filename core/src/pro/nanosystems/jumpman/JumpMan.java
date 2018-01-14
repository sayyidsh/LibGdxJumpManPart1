package pro.nanosystems.jumpman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;

public class JumpMan extends ApplicationAdapter {
    // TODO (2) Declare private Logger logger;
    private Logger logger;
    SpriteBatch batch;
    Texture img;
    @Override
    public void create() {
        // TODO (2) Instantiate logger Object logger = new Logger("Application Lifecycle", Logger.INFO);
        logger = new Logger("Application Lifecycle", Logger.INFO);
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        // TODO (3) logger.info("Create");
        logger.info("Create");
    }
    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
        // TODO (3) logger.info("Reneder");
        logger.info("Reneder");
    }
    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        // TODO (3) logger.info("Dispose");
        logger.info("Dispose");
    }
}
