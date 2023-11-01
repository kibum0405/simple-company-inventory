package simplecompanyinventory.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import simplecompanyinventory.BoundedContext1416Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1416Application.class })
public class CucumberSpingConfiguration {}
