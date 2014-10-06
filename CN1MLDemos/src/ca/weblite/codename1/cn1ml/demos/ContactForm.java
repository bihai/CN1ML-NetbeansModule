/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package ca.weblite.codename1.cn1ml.demos;

import com.codename1.ui.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;

class ContactForm {

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

    public ContactForm(java.util.Map context) {
        for (Object o : context.values()) {
            if (o instanceof Resources) {
                resources = (Resources) o;
            }
        }
    }

    private Container buildUI() throws Exception {
        Container root = new Container();
        BoxLayout rootLayout = new BoxLayout(BoxLayout.Y_AXIS);
        root.setLayout(rootLayout);
        init1_root(root, null);
        Label node1 = new Label();
        node1.setUIID("Title");
        node1.setText("Contact Details");
        if (node1.getClientProperty("__CN1ML_NO_ADD__") == null && root != node1.getParent()) {
            root.addComponent(node1);
        }
        Container node2 = new Container();
        TableLayout node2Layout = new TableLayout(5, 2);
        node2.setLayout(node2Layout);
        Container node3 = new Container();
        FlowLayout node3Layout = new FlowLayout();
        node3.setLayout(node3Layout);
        init2_node3(node3, node2);
        node3.addComponent(new Label("First Name"));
        if (node3.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node3.getParent()) {
            node2.addComponent(node3);
        }
        Container node4 = new Container();
        FlowLayout node4Layout = new FlowLayout();
        node4.setLayout(node4Layout);
        init3_node4(node4, node2);
        TextField node5 = new TextField();
        node5.setName("firstName");
        _nameIndex.put("firstName", node5);
        if (node5.getClientProperty("__CN1ML_NO_ADD__") == null && node4 != node5.getParent()) {
            node4.addComponent(node5);
        }
        if (node4.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node4.getParent()) {
            node2.addComponent(node4);
        }
        Container node6 = new Container();
        FlowLayout node6Layout = new FlowLayout();
        node6.setLayout(node6Layout);
        init4_node6(node6, node2);
        node6.addComponent(new Label("Last Name"));
        if (node6.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node6.getParent()) {
            node2.addComponent(node6);
        }
        Container node7 = new Container();
        FlowLayout node7Layout = new FlowLayout();
        node7.setLayout(node7Layout);
        init5_node7(node7, node2);
        TextField node8 = new TextField();
        node8.setName("lastName");
        _nameIndex.put("lastName", node8);
        if (node8.getClientProperty("__CN1ML_NO_ADD__") == null && node7 != node8.getParent()) {
            node7.addComponent(node8);
        }
        if (node7.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node7.getParent()) {
            node2.addComponent(node7);
        }
        Container node9 = new Container();
        FlowLayout node9Layout = new FlowLayout();
        node9.setLayout(node9Layout);
        init6_node9(node9, node2);
        node9.addComponent(new Label("Home Country"));
        if (node9.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node9.getParent()) {
            node2.addComponent(node9);
        }
        Container node10 = new Container();
        FlowLayout node10Layout = new FlowLayout();
        node10.setLayout(node10Layout);
        init7_node10(node10, node2);
        ComboBox node11 = new ComboBox();
        node11.setName("countrySelect");
        _nameIndex.put("countrySelect", node11);
        init8_node11(node11, node10);
        if (node11.getClientProperty("__CN1ML_NO_ADD__") == null && node10 != node11.getParent()) {
            node10.addComponent(node11);
        }
        if (node10.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node10.getParent()) {
            node2.addComponent(node10);
        }
        Container node12 = new Container();
        FlowLayout node12Layout = new FlowLayout();
        node12.setLayout(node12Layout);
        init9_node12(node12, node2);
        node12.addComponent(new Label("Bio (Paragraph)"));
        if (node12.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node12.getParent()) {
            node2.addComponent(node12);
        }
        Container node13 = new Container();
        FlowLayout node13Layout = new FlowLayout();
        node13.setLayout(node13Layout);
        init10_node13(node13, node2);
        TextArea node14 = new TextArea();
        node14.setName("bio");
        _nameIndex.put("bio", node14);
        init11_node14(node14, node13);
        init12_node14(node14, node13);
        if (node14.getClientProperty("__CN1ML_NO_ADD__") == null && node13 != node14.getParent()) {
            node13.addComponent(node14);
        }
        if (node13.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node13.getParent()) {
            node2.addComponent(node13);
        }
        if (node2.getClientProperty("__CN1ML_NO_ADD__") == null && root != node2.getParent()) {
            root.addComponent(node2);
        }
        Label node15 = new Label();
        node15.setUIID("Title");
        node15.setText("Preferences");
        if (node15.getClientProperty("__CN1ML_NO_ADD__") == null && root != node15.getParent()) {
            root.addComponent(node15);
        }
        Container node16 = new Container();
        TableLayout node16Layout = new TableLayout(1, 4);
        node16.setLayout(node16Layout);
        Container node17 = new Container();
        FlowLayout node17Layout = new FlowLayout();
        node17.setLayout(node17Layout);
        init13_node17(node17, node16);
        node17.addComponent(new Label("Software"));
        if (node17.getClientProperty("__CN1ML_NO_ADD__") == null && node16 != node17.getParent()) {
            node16.addComponent(node17);
        }
        Container node18 = new Container();
        FlowLayout node18Layout = new FlowLayout();
        node18.setLayout(node18Layout);
        init14_node18(node18, node16);
        CheckBox node19 = new CheckBox();
        node19.setName("softwareCheckbox");
        _nameIndex.put("softwareCheckbox", node19);
        if (node19.getClientProperty("__CN1ML_NO_ADD__") == null && node18 != node19.getParent()) {
            node18.addComponent(node19);
        }
        if (node18.getClientProperty("__CN1ML_NO_ADD__") == null && node16 != node18.getParent()) {
            node16.addComponent(node18);
        }
        Container node20 = new Container();
        FlowLayout node20Layout = new FlowLayout();
        node20.setLayout(node20Layout);
        init15_node20(node20, node16);
        node20.addComponent(new Label("Hardware"));
        if (node20.getClientProperty("__CN1ML_NO_ADD__") == null && node16 != node20.getParent()) {
            node16.addComponent(node20);
        }
        Container node21 = new Container();
        FlowLayout node21Layout = new FlowLayout();
        node21.setLayout(node21Layout);
        init16_node21(node21, node16);
        CheckBox node22 = new CheckBox();
        node22.setName("hardwareCheckbox");
        _nameIndex.put("hardwareCheckbox", node22);
        if (node22.getClientProperty("__CN1ML_NO_ADD__") == null && node21 != node22.getParent()) {
            node21.addComponent(node22);
        }
        if (node21.getClientProperty("__CN1ML_NO_ADD__") == null && node16 != node21.getParent()) {
            node16.addComponent(node21);
        }
        if (node16.getClientProperty("__CN1ML_NO_ADD__") == null && root != node16.getParent()) {
            root.addComponent(node16);
        }
        Button node23 = new Button();
        node23.setName("saveButton");
        _nameIndex.put("saveButton", node23);
        node23.setText("Save");
        if (node23.getClientProperty("__CN1ML_NO_ADD__") == null && root != node23.getParent()) {
            root.addComponent(node23);
        }
        return root;
    }

    private void init1_root(Container self, Container parent) {

        self.setScrollableY(true);

    }

    private void init2_node3(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(0, 0);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    private void init3_node4(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(0, 1);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    public TextField getFirstName() {
        return (TextField) get("firstName");
    }

    private void init4_node6(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(1, 0);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    private void init5_node7(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(1, 1);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    public TextField getLastName() {
        return (TextField) get("lastName");
    }

    private void init6_node9(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(2, 0);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    private void init7_node10(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(2, 1);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    public ComboBox getCountrySelect() {
        return (ComboBox) get("countrySelect");
    }

    private void init8_node11(ComboBox self, Container parent) {
        java.util.ArrayList opts = new java.util.ArrayList();
        opts.add("Canada");
        opts.add("United States");
        opts.add("France");
        opts.add("Spain");
        self.setModel(new com.codename1.ui.list.DefaultListModel(opts));

    }

    private void init9_node12(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(3, 0);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(2);
        parent.addComponent(c, self);
    }

    private void init10_node13(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(4, 0);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(2);
        parent.addComponent(c, self);
    }

    public TextArea getBio() {
        return (TextArea) get("bio");
    }

    private void init11_node14(TextArea self, Container parent) {
        self.setRows(5);

    }

    private void init12_node14(TextArea self, Container parent) {
        self.setColumns(30);

    }

    private void init13_node17(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(0, 0);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    private void init14_node18(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(0, 1);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    public CheckBox getSoftwareCheckbox() {
        return (CheckBox) get("softwareCheckbox");
    }

    private void init15_node20(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(0, 2);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    private void init16_node21(Container self, Container parent) {
        TableLayout l = (TableLayout) parent.getLayout();
        TableLayout.Constraint c = l.createConstraint(0, 3);
        c.setVerticalSpan(1);
        c.setHorizontalSpan(1);
        parent.addComponent(c, self);
    }

    public CheckBox getHardwareCheckbox() {
        return (CheckBox) get("hardwareCheckbox");
    }

    public Button getSaveButton() {
        return (Button) get("saveButton");
    }
}
