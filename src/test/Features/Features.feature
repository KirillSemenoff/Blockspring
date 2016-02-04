Feature: db-queries


  Scenario Outline:
    Given we are in <tag> and <block>
    When we run a block with default value, "<positive_value>" and "<negative_value>"
    Then perform check with "<expected_result>"

    Examples:
      |tag|block|positive_value|negative_value|expected_result|
      |//p[text()="db-queries"]|//a[contains(text(),' Blockspring - Line Graph From Query')]|positive_test |negative_test |expected_test|