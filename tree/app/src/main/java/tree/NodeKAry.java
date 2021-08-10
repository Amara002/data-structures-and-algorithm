package tree;

import java.util.ArrayList;
import java.util.List;

//public class NodeKAry {
//}
public class NodeKAry <T> {
    T value;
    public List<NodeKAry> children = new ArrayList<>();

    public NodeKAry(T value) {
        this.value = value;
    }


    public List<NodeKAry> getChildren() {
        return children;
    }

    public void addChild(NodeKAry child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{value= ");
        result.append(value);
        result.append("\nChildren: [");
        for (NodeKAry ch : children) {
            result.append("\n child: ");
            result.append(ch);
        }
        result.append("]");

        return result.toString();
    }
}