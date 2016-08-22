package cn.codetector.util.DataStructure.TreeStructure;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codetector on 8/20/16.
 */
public class TreeStructure<T> {
    TreeItem<T> rootItem;

    public TreeStructure(){
        rootItem = new TreeItem<T>(0,null);
    }

    public void sortTreeStructures(List<TreeItem> itemList){
        List<TreeItem> items = Lists.newCopyOnWriteArrayList(itemList);

        rootItem.setForSorting();
        List<Integer> parents = new ArrayList<>();
        for (TreeItem item : items) {
            if (item.getParentID() == 0) {
                item.setForSorting();
                rootItem.attachChildren(item);
                item.setParent(rootItem);
                parents.add(item.getParentID());
                items.remove(item);
            }
        }
        while (!parents.isEmpty()){
            List<Integer> newParents = new ArrayList<>();
            for (TreeItem item : items){
                if (parents.contains(item.getParentID())){
                    TreeItem parentItem = rootItem.findChildByID(item.getParentID());
                    if (parentItem != null){
                        item.setForSorting();
                        parentItem.attachChildren(item);
                        item.setParent(parentItem);
                        newParents.add(item.getId());
                    }
                }
            }
            parents = newParents;
        }
    }

    public TreeItem getRootItem(){
        return rootItem;
    }
}
