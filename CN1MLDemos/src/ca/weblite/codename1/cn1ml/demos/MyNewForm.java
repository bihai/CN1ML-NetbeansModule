/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package ca.weblite.codename1.cn1ml.demos;
import com.codename1.ui.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;
class MyNewForm {
private Container rootContainer;
private Resources resources;
public Container getRoot(){ if (rootContainer==null){ 
        try {rootContainer=buildUI();} catch (Exception ex){ex.printStackTrace();throw new RuntimeException(ex.getMessage());}} return rootContainer;}
private java.util.Map<String,Component> _nameIndex=new java.util.HashMap<String,Component>();
public Component get(String name){ getRoot(); return _nameIndex.get(name);}
public MyNewForm(java.util.Map context){
for (Object o : context.values()){ if (o instanceof Resources) resources=(Resources)o;}
}
private Container buildUI() throws Exception {
Container root = new Container();
BorderLayout rootLayout = new BorderLayout();
root.setLayout(rootLayout);
Container node1 = new Container();
FlowLayout node1Layout = new FlowLayout();
node1.setLayout(node1Layout);
node1.addComponent(new Label("Hello World"));
if (root != node1.getParent()){
root.addComponent(BorderLayout.NORTH, node1);
}
Container node2 = new Container();
FlowLayout node2Layout = new FlowLayout();
node2.setLayout(node2Layout);
Container node3 = new Container();
TableLayout node3Layout = new TableLayout(2,2);
node3.setLayout(node3Layout);
Container node4 = new Container();
FlowLayout node4Layout = new FlowLayout();
node4.setLayout(node4Layout);
init1_node4(node4, node3);
node4.addComponent(new Label("Name"));
if (node3 != node4.getParent()){
node3.addComponent(node4);
}
Container node5 = new Container();
FlowLayout node5Layout = new FlowLayout();
node5.setLayout(node5Layout);
init2_node5(node5, node3);
TextField node6 = new TextField();
node6.setName("nameField");
_nameIndex.put("nameField", node6);
if (node5 != node6.getParent()){
node5.addComponent(node6);
}
if (node3 != node5.getParent()){
node3.addComponent(node5);
}
Container node7 = new Container();
FlowLayout node7Layout = new FlowLayout();
node7.setLayout(node7Layout);
init3_node7(node7, node3);
Button node8 = new Button();
node8.setName("submit");
_nameIndex.put("submit", node8);
node8.setText("Submit");
if (node7 != node8.getParent()){
node7.addComponent(node8);
}
if (node3 != node7.getParent()){
node3.addComponent(node7);
}
if (node2 != node3.getParent()){
node2.addComponent(node3);
}
if (root != node2.getParent()){
root.addComponent(BorderLayout.CENTER, node2);
}
Container node9 = new Container();
FlowLayout node9Layout = new FlowLayout();
node9.setLayout(node9Layout);
node9.addComponent(new Label("Good Bye World"));
if (root != node9.getParent()){
root.addComponent(BorderLayout.SOUTH, node9);
}
return root;
}
private void init1_node4(Container self, Container parent){
TableLayout l = (TableLayout)parent.getLayout(); TableLayout.Constraint c = l.createConstraint(0,0); c.setVerticalSpan(1); c.setHorizontalSpan(1); parent.addComponent(c, self);
}
private void init2_node5(Container self, Container parent){
TableLayout l = (TableLayout)parent.getLayout(); TableLayout.Constraint c = l.createConstraint(0,1); c.setVerticalSpan(1); c.setHorizontalSpan(1); parent.addComponent(c, self);
}
public TextField getNameField(){
      return (TextField)get("nameField");
      }
private void init3_node7(Container self, Container parent){
TableLayout l = (TableLayout)parent.getLayout(); TableLayout.Constraint c = l.createConstraint(1,0); c.setVerticalSpan(1); c.setHorizontalSpan(2); parent.addComponent(c, self);
}
public Button getSubmit(){
      return (Button)get("submit");
      }
}