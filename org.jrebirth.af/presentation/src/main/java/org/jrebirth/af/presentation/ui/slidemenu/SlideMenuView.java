/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.af.presentation.ui.slidemenu;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

import org.jrebirth.af.api.exception.CoreException;
import org.jrebirth.af.api.ui.annotation.OnMouse;
import org.jrebirth.af.api.ui.annotation.RootNodeId;
import org.jrebirth.af.api.ui.annotation.type.Mouse;
import org.jrebirth.af.core.ui.DefaultView;
import org.jrebirth.af.core.wave.WBuilder;
import org.jrebirth.af.presentation.PrezWaves;
import org.jrebirth.af.presentation.command.ShowSlideCommand;
import org.jrebirth.af.presentation.model.Slide;

/**
 *
 * The class <strong>SlideMenuView</strong>.
 *
 * @author Sébastien Bordes
 */
@RootNodeId("SlideMenu")
@OnMouse({ Mouse.Clicked, Mouse.Released })
public final class SlideMenuView extends DefaultView<SlideMenuModel, ListView<Slide>, SlideMenuController> {

    /**
     * Default Constructor.
     *
     * @param model the view model
     *
     * @throws CoreException if build fails
     */
    public SlideMenuView(final SlideMenuModel model) throws CoreException {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void initView() {

        node().setPrefSize(600, 600);
        node().setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        node().setMinSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

        final ObservableList<Slide> items = FXCollections.observableArrayList(model().getSlides());
        node().setItems(items);

        node().getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        node().getSelectionModel().select(model().object());
        node().scrollTo(model().object());

        node().getSelectionModel().selectedItemProperty().addListener(
                                                                             (final ObservableValue<? extends Slide> ov, final Slide old_val, final Slide new_val) -> {
                                                                                 model().callCommand(ShowSlideCommand.class, WBuilder.waveData(PrezWaves.SLIDE, new_val));
                                                                                 ((Pane) node().getParent()).getChildren().remove(node());
                                                                             });

        node().setCellFactory(list -> {
            return new ListCell<Slide>() {

                @Override
                public void updateItem(final Slide item, final boolean empty) {
                    super.updateItem(item, empty);
                    if (item == null) {
                        setText(null);
                    } else {
                        setText(item.getPage() + ". " + item.getTitle());
                    }
                }

            };
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void hide() {
        // Nothing to do yet
        super.hide();
    }

}
