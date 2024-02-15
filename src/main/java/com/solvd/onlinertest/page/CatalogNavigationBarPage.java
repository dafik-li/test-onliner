package com.solvd.onlinertest.page;

import com.solvd.onlinertest.domain.CatalogNavigation;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CatalogNavigationBarPage extends AbstractPage {


    @FindBy(xpath = "//li[./span[@class='catalog-navigation-classifier__item-title']/span['%s']]")
    private ExtendedWebElement item;


    public CatalogNavigationBarPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
    }
    public Point getItemLocation(CatalogNavigation enumItem) {
        return item.format(enumItem.getName()).getLocation();
    }
    @Override
    public void open() {
        super.openURL(Configuration.getRequired("home_url"));
    }
}
//li[./span[@class='catalog-navigation-classifier__item-title']/span[text() = '%s']]
//span[@class = 'catalog-navigation-classifier__item-title-wrapper']['%s']
