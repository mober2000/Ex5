package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SearchPageObject extends MainPageObject {

    public SearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }

    private static final String

                SEARCH_INIT_ELEMENT = "org.wikipedia:id/search_container",
                PAGE_LIST_TITLE_1 = "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Sovereign state in Eastern Europe and Northern Asia since 1991']",
                PAGE_LIST_TITLE_2 ="//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='East Slavic language originating in European Russia']",
                TITLE = "org.wikipedia:id/view_page_title_text",
                SEARCH_INPUT = "//*[contains(@text,'Search…')]";



    public void initSearchInput()
    {
        this.waitForElementAndClick(By.id(SEARCH_INIT_ELEMENT),  "Cannot find 'Search Wikipedia' input", 5);
    }

    public void typeSearchLine(String word_search)
    {
        this.waitForElementAndSendKeys(By.xpath(SEARCH_INPUT), word_search, "Cannot find search input", 5);
    }

    public void pageListTitleFirst()
    {
        this.waitForElementAndClick(By.xpath(PAGE_LIST_TITLE_1), "Cannot find Search Wikipedia input", 5);
    }

    public void pageListTitleSecond()
    {
        this.waitForElementAndClick(By.xpath(PAGE_LIST_TITLE_2), "Cannot find Search Wikipedia input", 5);
    }

    public void waitForTitleElement()
    {
        this.waitForElementPresent(By.id(TITLE), "Cannot find article title", 15);
    }
}
