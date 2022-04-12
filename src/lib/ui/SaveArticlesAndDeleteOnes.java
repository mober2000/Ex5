package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SaveArticlesAndDeleteOnes extends MainPageObject {

    public SaveArticlesAndDeleteOnes(AppiumDriver driver) {
        super(driver);
    }

    private static final String
            OPTION_BUTTON = "//android.widget.ImageView[@content-desc='More options']",
            FONT_BUTTON = "//*[@text='Font and theme']",
            OPTION_ADD_TO_MY_LIST_BUTTON = "//*[@text='Add to reading list']",
            ADD_TO_MY_LIST_OVERLAY = "org.wikipedia:id/onboarding_button",
            MY_LIST_NAME_INPUT = "org.wikipedia:id/text_input",
            MY_LIST_OK_BUTTON = "//*[@text='OK']",
            CLOSE_ARTICLE_BUTTON = "//android.widget.ImageButton[@content-desc='Navigate up']",
            NAME_FOLDER = "//*[@text='EX5 FOLDER']",
            VIEW_LIST = "//*[@text='VIEW LIST']",
            TEXT_FIRST_TITLE = "//*[@text='sovereign state in Eastern Europe and Northern Asia since 1991']",
            TEXT_SECOND_TITLE = "//*[@text='East Slavic language originating in European Russia']",
            REMAINDER_TITLE = "//*[@resource-id='org.wikipedia:id/view_page_title_text'][contains(@text,'Russia')]";

    public void addArticleToMyFirstList(String name_of_folder) {

        this.waitForElementAndClick(
                By.xpath(OPTION_BUTTON),
                "Cannot find button to open article option",
                5);

        this.waitForElementPresent(
                By.xpath(FONT_BUTTON),
                "Cannot find font and theme",
                15);

        this.waitForElementAndClick(
                By.xpath(OPTION_ADD_TO_MY_LIST_BUTTON),
                "Cannot find option to to add article to reading list",
                5);


        this.waitForElementAndClick(
                By.id(ADD_TO_MY_LIST_OVERLAY),
                "Cannot find 'Got it' tip overlay",
                5);

        this.waitForElementAndClear(
                By.id(MY_LIST_NAME_INPUT),
                "Cannot find input to set name of articles folder",
                5);

        this.waitForElementAndSendKeys(
                By.id(MY_LIST_NAME_INPUT),
                name_of_folder,
                "Cannot put text into articles folder input",
                5);

        this.waitForElementAndClick(
                By.xpath(MY_LIST_OK_BUTTON),
                "Cannot press OK button",
                5);

        this.waitForElementAndClick(
                By.xpath(CLOSE_ARTICLE_BUTTON),
                "Cannot close article, cannot find X link",
                5);
    }

    public void addArticleToMySecondList() {
        this.waitForElementAndClick(
                By.xpath(OPTION_BUTTON),
                "Cannot find button to open article option",
                5);

        this.waitForElementPresent(
                By.xpath(FONT_BUTTON),
                "Cannot find font and theme",
                15);

        this.waitForElementAndClick(
                By.xpath(OPTION_ADD_TO_MY_LIST_BUTTON),
                "Cannot find option to to add article to reading list",
                5);
    }

        public void SearchNameFolder ()
        {
            this.waitForElementAndClick(By.xpath(NAME_FOLDER), "Cannot find option to to add article to reading list", 5);
        }

        public void clickViewList()
        {
            this.waitForElementAndClick(By.xpath(VIEW_LIST), "Cannot find option to add article to reading list", 5);
        }

        public void swipeAndDeleteFirstArticle()
        {
            this.swipeUpToLeft(By.xpath(TEXT_FIRST_TITLE), "Cannot find saved article");
        }

        public void findSecondArticle()
        {
            this.waitForElementPresent(By.xpath(TEXT_SECOND_TITLE), "Cannot find article", 15);
        }

        public void ClickSecondArticle()
        {
            this.waitForElementAndClick(By.xpath(TEXT_SECOND_TITLE), "Cannot find article", 5);
        }

        public void remindedTitle()
        {
            this.waitForElementPresent(By.xpath(REMAINDER_TITLE), "Cannot find title", 15);
        }

    }

