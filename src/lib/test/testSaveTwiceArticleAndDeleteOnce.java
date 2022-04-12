package lib.test;

import lib.CoreTestCase;
import lib.ui.SaveArticlesAndDeleteOnes;
import lib.ui.SearchPageObject;
import org.junit.Test;

public class testSaveTwiceArticleAndDeleteOnce extends CoreTestCase {

    @Test
    public void testSaveTwiceArticleAndDeleteOnce() {

        SaveArticlesAndDeleteOnes SaveArticlesAndDeleteOnes = new SaveArticlesAndDeleteOnes(driver);
        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        String word_search = "Russia";
        String name_of_folder = "EX5 FOLDER";

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(word_search);
        SearchPageObject.pageListTitleFirst();
        SearchPageObject.waitForTitleElement();
        SaveArticlesAndDeleteOnes.addArticleToMyFirstList(name_of_folder);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(word_search);
        SearchPageObject.pageListTitleSecond();
        SearchPageObject.waitForTitleElement();
        SaveArticlesAndDeleteOnes.addArticleToMySecondList();

        SaveArticlesAndDeleteOnes.SearchNameFolder();
        SaveArticlesAndDeleteOnes.clickViewList();
        SaveArticlesAndDeleteOnes.swipeAndDeleteFirstArticle();
        SaveArticlesAndDeleteOnes.findSecondArticle();
        SaveArticlesAndDeleteOnes.ClickSecondArticle();
        SaveArticlesAndDeleteOnes.remindedTitle();








    }
}
