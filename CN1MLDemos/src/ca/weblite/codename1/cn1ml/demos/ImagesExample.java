/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package ca.weblite.codename1.cn1ml.demos;

import com.codename1.ui.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;

class ImagesExample {

    private Container rootContainer;
    private Resources resources;

    public Container getRoot() {
        if (rootContainer == null) {
            try {
                rootContainer = buildUI();
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex.getMessage());
            }
        }
        return rootContainer;
    }
    private java.util.Map<String, Component> _nameIndex = new java.util.HashMap<String, Component>();

    public Component get(String name) {
        getRoot();
        return _nameIndex.get(name);
    }

    public ImagesExample(java.util.Map context) {
        for (Object o : context.values()) {
            if (o instanceof Resources) {
                resources = (Resources) o;
            }
        }
    }

    private Container buildUI() throws Exception {
        Container root = new Container();
        GridLayout rootLayout = new GridLayout(3, 3);
        root.setLayout(rootLayout);
        root.addComponent(new Label(resources.getImage("bills.gif")));
        root.addComponent(new Label(resources.getImage("bengals.gif")));
        root.addComponent(new Label(resources.getImage("browns.gif")));
        root.addComponent(new Label(resources.getImage("cardinals.gif")));
        root.addComponent(new Label(resources.getImage("cowboys.gif")));
        root.addComponent(new Label(resources.getImage("falcons.gif")));
        root.addComponent(new Label(resources.getImage("panthers.gif")));
        root.addComponent(new Label(resources.getImage("ravens.gif")));
        root.addComponent(new Label(resources.getImage("bears.gif")));
        return root;
    }
}
