import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public boolean addComponent(Component child) {
        return children.add(child);
    }

    public boolean removeComponent(Component child) {
        return children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }
}
