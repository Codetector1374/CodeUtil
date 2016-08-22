package cn.codetector.util.DataStructure.TreeStructure;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * Created by codetector on 8/20/16.
 */
public class TreeItem<T> {
    private int id;
    private T content;
    private TreeItem parent;
    private int parentID;
    private List<TreeItem> children;

    public TreeItem(int id, T content, TreeItem parent){
        this.id = id;
        this.content = content;
        this.parent = parent;
    }

    public TreeItem(int id, T content){
        this.id = id;
        this.content = content;
        this.parent = null;
    }

    public TreeItem(int id, T content, int parentID){
        this.id = id;
        this.content = content;
        this.parent = null;
        this.parentID = parentID;
    }

    public T getContent(){
        return content;
    }

    public TreeItem getParent() {
        return parent;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void setParent(TreeItem parent) {
        this.parent = parent;
    }

    public List<TreeItem> getChildren(){
        if (children != null){
            return Collections.unmodifiableList(children);
        }else{
            return Lists.newArrayList();
        }
    }

    protected TreeItem<T> findChildByID(int id){
        if (children != null && !children.isEmpty()){
            for (TreeItem t : children){
                if (t.getId() == id)
                    return t;
            }
        }
        return null;
    }

    public void attachChildren(TreeItem item){
        if (children == null){
            children = Lists.newArrayList();
        }
        children.add(item);
    }

    public boolean isRoot(){
        return parent == null;
    }

    public boolean isLeaf(){
        return children == null || children.size()==0;
    }

    public boolean isBranch(){
        return parent != null && children != null && children.size() > 0;
    }

    public int getId() {
        return id;
    }

    public int getParentID() {
        return parentID;
    }

    protected void setForSorting(){
        if (children != null){
            children.clear();
        }
        parent = null;
    }
}