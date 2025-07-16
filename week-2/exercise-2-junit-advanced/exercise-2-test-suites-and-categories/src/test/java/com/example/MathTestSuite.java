package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MathTest1.class, MathTest2.class})
public class MathTestSuite {
    // Empty class - runs the tests from both
}
