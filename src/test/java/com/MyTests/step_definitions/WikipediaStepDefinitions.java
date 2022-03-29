package com.MyTests.step_definitions;

import com.MyTests.pages.WikiSearchPage;
import com.MyTests.utilities.Driver;
import com.MyTests.pages.WikiSearchPage;
import com.MyTests.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

        wikiSearchPage.searchBox.sendKeys(string);
    }

    @And("User click wiki search button")
    public void userClickWikiSearchButton() {
        wikiSearchPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        //verify actual title contains string (coming from feature file)
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
    @Then("User sees {string} is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String string) {

        Assert.assertTrue(wikiSearchPage.mainHeader.isDisplayed());
        Assert.assertTrue(wikiSearchPage.mainHeader.getText().equals(string));

    }


}

