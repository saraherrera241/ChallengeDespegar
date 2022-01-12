#Author:sara.herrera@accenture.com
@Flights
Feature: Title of your feature
  I want to use this template for my feature file

  @BookFlight
  Scenario Outline: Book a flight
    Given I open despegar page
    When I search for flights with <originFlight> and <destinationFlight>
    Then I validate Idiom added

    Examples: 
      | originFlight | destinationFlight |
      | Medellín     | Bogota            |
