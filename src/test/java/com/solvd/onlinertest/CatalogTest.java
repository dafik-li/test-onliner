package com.solvd.onlinertest;

import com.solvd.onlinertest.domain.CatalogNavigation;
import com.solvd.onlinertest.page.CatalogNavigationBarPage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.List;

public class CatalogTest extends AbstractTest {

    @Test(description = "verify navigation bar in catalog")
    public void verifyCatalogNavigateBarTest() {
        SoftAssert sa = new SoftAssert();
        CatalogNavigationBarPage page = new CatalogNavigationBarPage(getDriver());
        page.open();
        sa.assertTrue(page.isPageOpened(), "page is not opened");

        List<Integer> xPositions = new ArrayList<>();
        for (CatalogNavigation item : CatalogNavigation.values()) {
            xPositions.add(page.getItemLocation(item).getX());
        }
        sa.assertTrue(positionItems(xPositions),"elements are all right");

        sa.assertAll();
    }

    private boolean positionItems(List<Integer> positions) {
        int startValueX = 0;
        for (int x : positions) {
            if (x <= startValueX) {
                return false;
            }
            startValueX = x;
        }
        return true;
    }
}
