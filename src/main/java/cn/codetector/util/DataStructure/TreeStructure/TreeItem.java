package cn.codetector.util.DataStructure.TreeStructure;

import com.google.common.collect.Lists;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Collections;
import java.util.List;

/**
 * Created by codetector on 8/20/16.
 */
public class TreeItem<T> {
    private int id;
    private T content;
    private int parentID;
    private List<TreeItem> children;

    public TreeItem(int id, T content){
        this.id = id;
        this.content = content;
    }

    public TreeItem(int id, T content, int parentID){
        this.id = id;
        this.content = content;
        this.parentID = parentID;
    }

    public T getContent(){
        return content;
    }

    public void setContent(T content) {
        this.content = content;
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

    public boolean isLeaf(){
        return children == null || children.size()==0;
    }

    public boolean isBranch(){
        return !isLeaf();
    }

    /**
     * @deprecated NoLonger works. Now returns the value of isBranch
     * @return
     */
    @Deprecated
    public boolean isRoot(){
        return isBranch();
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
    }

    public JSONObject toJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("label",this.content);
        jsonObject.put("id",this.id);
        if (!isLeaf()){
            JSONArray children = new JSONArray();
            for (TreeItem i : getChildren()){
                children.add(i.toJson());
            }
            jsonObject.put("children",children);
        }
        return jsonObject;
    }

    @Override
    public String toString() {
        return toJson().toJSONString();
    }
}