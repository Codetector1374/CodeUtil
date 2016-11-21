package cn.codetector.util.DataStructure.TreeStructure;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Codetector on 8/22/16.
 */
public class TreeItemTest {
    @Test
    public void findChildByID() throws Exception {

    }

    @Test
    public void testToString() throws Exception {
        assertEquals(branchItem.toString(), ((JSONObject)((JSONArray) rootItem.toJson().get("children")).get(0)).toJSONString());
    }

    TreeItem<String> rootItem;
    TreeItem<String> branchItem;
    TreeItem<String> leafItem;

    @Before
    public void setUp() throws Exception {
        rootItem = new TreeItem<String>(0,"root");
        branchItem = new TreeItem<String>(1,"branch");
        rootItem.attachChildren(branchItem);
        leafItem = new TreeItem<String>(2,"leaf");
        branchItem.attachChildren(leafItem);
    }

    @Test
    public void getContent() throws Exception {
        assertEquals("root",rootItem.getContent());
        assertEquals("branch",branchItem.getContent());
        assertEquals("leaf",leafItem.getContent());
    }

    @Test
    public void setContent() throws Exception {
        rootItem.setContent("LKASJDL:KSAJPODIUJIPAS");
        assertEquals("LKASJDL:KSAJPODIUJIPAS",rootItem.getContent());
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
    public void isLeaf() throws Exception {
        assertFalse(rootItem.isLeaf());
        assertFalse(branchItem.isLeaf());
        assertTrue(leafItem.isLeaf());
    }

    @Test
    public void isBranch() throws Exception {
        assertTrue(rootItem.isBranch());
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