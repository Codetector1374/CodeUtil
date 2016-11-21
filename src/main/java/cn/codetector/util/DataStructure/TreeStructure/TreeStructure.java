package cn.codetector.util.DataStructure.TreeStructure;

import com.google.common.collect.Lists;
import javafx.beans.property.ReadOnlyObjectProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codetector on 8/20/16.
 */
public class TreeStructure<T> {
    TreeItem<T> rootItem;
    T rootName = null;

    public TreeStructure() {
        rootItem = new TreeItem<T>(0, rootName);
    }

    public TreeStructure(T rootName) {
        this.rootName = rootName;
        this.rootItem = new TreeItem<T>(0, rootName);
    }

    public void sortTreeStructures(List<TreeItem<T>> itemList) {
        List<TreeItem<T>> items = Lists.newCopyOnWriteArrayList(itemList);
        List<TreeItem<T>> sortingRoot = Lists.newArrayList();
        sortingRoot.add(rootItem);

        rootItem.setForSorting();
        while (!sortingRoot.isEmpty()) {
            List<TreeItem<T>> newSearchRoots = Lists.newArrayList();
            for (TreeItem item : items) {
                for (TreeItem<T> searchRootItem : sortingRoot) {
                    if (searchRootItem.getId() == item.getParentID()) {
                        item.setForSorting();
                        searchRootItem.attachChildren(item);
                        newSearchRoots.add(item);
                        items.remove(item);
                    }
                }
            }
            sortingRoot = newSearchRoots;
        }

    }

    public TreeItem getRootItem() {
        return rootItem;
    }
}
