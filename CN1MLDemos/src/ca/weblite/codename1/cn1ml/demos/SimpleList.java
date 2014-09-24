/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package ca.weblite.codename1.cn1ml.demos;

import com.codename1.ui.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;

class SimpleList {

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

    public SimpleList(java.util.Map context) {
        for (Object o : context.values()) {
            if (o instanceof Resources) {
                resources = (Resources) o;
            }
        }
    }

    private Container buildUI() throws Exception {
        Container root = new Container();
        BorderLayout rootLayout = new BorderLayout();
        root.setLayout(rootLayout);
        List node1 = new List();
        node1.setName("bookList");
        _nameIndex.put("bookList", node1);
        init1_node1(node1, root);
        if (root != node1.getParent()) {
            root.addComponent(BorderLayout.CENTER, node1);
        }
        return root;
    }

    public List getBookList() {
        return (List) get("bookList");
    }

    private void init1_node1(List self, Container parent) {
        java.util.ArrayList opts = new java.util.ArrayList();
        opts.add("The Count of Monte Cristo");
        opts.add("Tale of Two Cities");
        opts.add("The Incredible Hulk");
        self.setModel(new com.codename1.ui.list.DefaultListModel(opts));

    }
}
