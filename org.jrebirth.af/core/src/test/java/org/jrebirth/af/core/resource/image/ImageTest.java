package org.jrebirth.af.core.resource.image;

import java.util.Arrays;

import javafx.scene.image.Image;

import org.jrebirth.af.core.resource.AbstractBaseParams;
import org.jrebirth.af.core.resource.ResourceBuilders;
import org.jrebirth.af.core.resource.image.ImageItem;
import org.jrebirth.af.core.resource.image.LocalImage;
import org.jrebirth.af.core.resource.provided.JRebirthParameters;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The class <strong>ImageTest</strong>.
 * 
 * @author Sébastien Bordes
 */
public class ImageTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        JRebirthParameters.IMAGE_FOLDER.define(Arrays.asList("images", "imagesBis"));
    }

    @Test
    public void localImage() {

        checkLocalImage(TestImages.TEST_LOCAL_IMAGE_1);
        checkLocalImage(TestImages.TEST_LOCAL_IMAGE_2);
        checkLocalImage(TestImages.TEST_LOCAL_IMAGE_3);
        checkLocalImage(TestImages.TEST_LOCAL_IMAGE_4);
    }

    private void checkLocalImage(final ImageItem imageItem) {
        final Image image = imageItem.get();
        final LocalImage wc = (LocalImage) ResourceBuilders.IMAGE_BUILDER.getParam(imageItem);

        assertEquals(image.getProgress(), 1.0, 0.0);

    }

    @Test
    public void webImage() {

        checkWebImage(TestImages.TEST_WEB_IMAGE_1);
        checkWebImage(TestImages.TEST_WEB_IMAGE_2);
        checkWebImage(TestImages.TEST_WEB_IMAGE_3);
    }

    private void checkWebImage(final ImageItem imageItem) {
        final Image image = imageItem.get();
        final AbstractBaseParams wc = (AbstractBaseParams) ResourceBuilders.IMAGE_BUILDER.getParam(imageItem);

        assertEquals(image.getProgress(), 1.0, 0.0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
