Feature: JobSearch Test
  As user I want search job on cv library uk website


  Scenario Outline: S : User should search job successfully
    Given I am on homepage
    When I enter jobTitle "<jobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I click on more search options link
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on findJob button
    Then I should see the "<result>"

    Examples:
      | jobTitle      | location | distance      | salaryMin | salaryMax | salaryType | jobType   | result                                             |
      | Tester        | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill        |
      | Sales         | Swindon  | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Sales jobs in Swindon                    |
      | Test Manger   | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Test Manager jobs in Harrow on the Hill  |
      | Test Engineer | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Test Engineer jobs in Harrow on the Hill |
      | Test Manger   | Harrow   | up to 5 miles | 40000     | 500000    | Per annum  | Permanent | Permanent Test Manager jobs in Harrow on the Hill  |
      | Test Analyst  | Harrow   | up to 5 miles | 30000     | 800000    | Per annum  | Permanent | Permanent Test Analyst jobs in Harrow on the Hill  |




