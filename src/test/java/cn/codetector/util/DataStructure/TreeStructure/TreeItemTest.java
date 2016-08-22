package cn.codetector.util.DataStructure.TreeStructure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Codetector on 8/22/16.
 */
public class TreeItemTest {
    TreeItem<String> rootItem;
    TreeItem<String> branchItem;
    TreeItem<String> leafItem;

    @Before
    public void setUp() throws Exception {
        rootItem = new TreeItem<String>(0,"root");
        branchItem = new TreeItem<String>(1,"branch",rootItem);
        rootItem.attachChildren(branchItem);
        leafItem = new TreeItem<String>(2,"leaf",branchItem);
        branchItem.attachChildren(leafItem);
    }

    @Test
    public void getContent() throws Exception {
        assertEquals("root",rootItem.getContent());
        assertEquals("branch",branchItem.getContent());
        assertEquals("leaf",leafItem.getContent());
    }

    @Test
    public void getParent() throws Exception {
        assertEquals(null,rootItem.getParent());
        assertEquals(rootItem,branchItem.getParent());
        assertEquals(branchItem,leafItem.getParent());
    }

    @Test
    public void setContent() throws Exception {
        rootItem.setContent("LKASJDL:KSAJPODIUJIPAS");
        assertEquals("LKASJDL:KSAJPODIUJIPAS",rootItem.getContent());
    }

    @Test
    public void setParent() throws Exception {
        rootItem.setParent(leafItem);
        assertEquals(leafItem,rootItem.getParent());
    }

    @Test
    public void getChildren() throws Exception {
        assertNotNull(rootItem.getChildren());
        assertTrue(rootItem.getChildren().size()>0);
    }

    @Test
    public void attachChildren() throws Exception {
        leafItem.attachChildren(rootItem);
        assertNotNull(leafItem.getChildren());
        assertTrue(leafItem.getChildren().size()>0);
    }

    @Test
    public void isRoot() throws Exception {
        assertTrue(rootItem.isRoot());
        assertFalse(branchItem.isRoot());
        assertFalse(leafItem.isRoot());
    }

    @Test
    public void isLeaf() throws Exception {
        assertFalse(rootItem.isLeaf());
        assertFalse(branchItem.isLeaf());
        assertTrue(leafItem.isLeaf());
    }

    @Test
    public void isBranch() throws Exception {
        assertFalse(rootItem.isBranch());
        assertTrue(branchItem.isBranch());
        assertFalse(leafItem.isBranch());
    }

    @After
    public void tearDown() throws Exception {
        rootItem = null;
        branchItem = null;
        leafItem = null;
    }

}