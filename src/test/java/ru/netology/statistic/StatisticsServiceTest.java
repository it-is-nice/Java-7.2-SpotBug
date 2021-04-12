package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  StatisticsService service = new StatisticsService();

  long[] incomesInBillions = {12, 5, 8, 4, 5, 13, 3, 8, 6, 11, 11, 12};


  @Test

  void findMax() {assertEquals(13, service.findMax(incomesInBillions));}


  @Test
  void findMin() {assertEquals(3, service.findMin(incomesInBillions));}


}
